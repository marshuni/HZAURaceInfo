package com.demo.Dao;

import com.demo.Entity.User;
import com.demo.Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDao {

    public User getUser(String UID) {
        User user = null;
        String sql = "SELECT * FROM Users WHERE UID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, UID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUID(rs.getString("UID"));
                user.setAuthed(rs.getBoolean("Authed"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void insertUser(User user) {
        String sql = "INSERT INTO Users (UID, Authed) VALUES (?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUID());
            stmt.setBoolean(2, user.getAuthed());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        String sql = "UPDATE Users SET Authed = ? WHERE UID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, user.getAuthed());
            stmt.setString(2, user.getUID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String UID) {
        String sql = "DELETE FROM Users WHERE UID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, UID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
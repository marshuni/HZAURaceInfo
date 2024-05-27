package com.demo.Dao;

import com.demo.Entity.Administrator;
import java.sql.*;

public class AdministratorsDao {
    private Connection conn;

    public AdministratorsDao(Connection conn) {
        this.conn = conn;
    }

    public void insertAdministrator(Administrator admin) throws SQLException {
        String sql = "INSERT INTO Administrators (adminID, adminName, adminPassword) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, admin.getAdminID());
        pstmt.setString(2, admin.getAdminName());
        pstmt.setString(3, admin.getAdminPassword());
        pstmt.executeUpdate();
    }

    public void updateAdministrator(Administrator admin) throws SQLException {
        String sql = "UPDATE Administrators SET adminName = ?, adminPassword = ? WHERE adminID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, admin.getAdminName());
        pstmt.setString(2, admin.getAdminPassword());
        pstmt.setString(3, admin.getAdminID());
        pstmt.executeUpdate();
    }

    public void deleteAdministrator(String adminID) throws SQLException {
        String sql = "DELETE FROM Administrators WHERE adminID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, adminID);
        pstmt.executeUpdate();
    }

    public Administrator getAdministrator(String adminID) throws SQLException {
        String sql = "SELECT * FROM Administrators WHERE adminID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, adminID);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new Administrator(rs.getString("adminID"), rs.getString("adminName"), rs.getString("adminPassword"));
        } else {
            return null;
        }
    }
}
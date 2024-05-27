package com.demo.Dao;

import com.demo.Entity.*;
import java.sql.*;

public class MarkDao {
    private Connection conn;

    public MarkDao(Connection conn) {
        this.conn = conn;
    }

    public void insertMark(Mark mark) throws SQLException {
        String sql = "INSERT INTO Mark (MID, CID, UID, scheduled) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, mark.getMID());
        pstmt.setInt(2, mark.getCID());
        pstmt.setString(3, mark.getUID());
        pstmt.setBoolean(4, mark.isScheduled());
        pstmt.executeUpdate();
    }

    public void updateMark(Mark mark) throws SQLException {
        String sql = "UPDATE Mark SET CID = ?, UID = ?, scheduled = ? WHERE MID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, mark.getCID());
        pstmt.setString(2, mark.getUID());
        pstmt.setBoolean(3, mark.isScheduled());
        pstmt.setInt(4, mark.getMID());
        pstmt.executeUpdate();
    }

    public void deleteMark(int MID) throws SQLException {
        String sql = "DELETE FROM Mark WHERE MID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, MID);
        pstmt.executeUpdate();
    }

    public Mark getMark(int MID) throws SQLException {
        String sql = "SELECT * FROM Mark WHERE MID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, MID);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new Mark(rs.getInt("MID"), rs.getInt("CID"), rs.getString("UID"), rs.getBoolean("scheduled"));
        } else {
            return null;
        }
    }
}
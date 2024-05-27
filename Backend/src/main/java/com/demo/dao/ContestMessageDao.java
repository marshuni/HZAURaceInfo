package com.demo.Dao;

import com.demo.Entity.*;
import java.sql.*;

public class ContestMessageDao {
    private Connection conn;

    public ContestMessageDao(Connection conn) {
        this.conn = conn;
    }

    public void insertContestMessage(ContestMessage cm) throws SQLException {
        String sql = "INSERT INTO ContestMessage (CMID, date, content, publisher, CID) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, cm.getCMID());
        pstmt.setDate(2, new java.sql.Date(cm.getDate().getTime()));
        pstmt.setString(3, cm.getContent());
        pstmt.setString(4, cm.getPublisher());
        pstmt.setInt(5, cm.getCID());
        pstmt.executeUpdate();
    }

    public void updateContestMessage(ContestMessage cm) throws SQLException {
        String sql = "UPDATE ContestMessage SET date = ?, content = ?, publisher = ?, CID = ? WHERE CMID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setDate(1, new java.sql.Date(cm.getDate().getTime()));
        pstmt.setString(2, cm.getContent());
        pstmt.setString(3, cm.getPublisher());
        pstmt.setInt(4, cm.getCID());
        pstmt.setInt(5, cm.getCMID());
        pstmt.executeUpdate();
    }

    public void deleteContestMessage(int CMID) throws SQLException {
        String sql = "DELETE FROM ContestMessage WHERE CMID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, CMID);
        pstmt.executeUpdate();
    }

    public ContestMessage getContestMessage(int CMID) throws SQLException {
        String sql = "SELECT * FROM ContestMessage WHERE CMID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, CMID);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new ContestMessage(rs.getInt("CMID"), rs.getDate("date"), rs.getString("content"),
                    rs.getString("publisher"), rs.getInt("CID"));
        } else {
            return null;
        }
    }
}
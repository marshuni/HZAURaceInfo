package com.demo.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.demo.Entity.Contest;
import com.demo.Util.DBUtil;
/*-- 创建竞赛表
CREATE TABLE IF NOT EXISTS Contest (
        ID INT PRIMARY KEY,
        name VARCHAR(255),
level VARCHAR(255),
category VARCHAR(255),
publisher VARCHAR(255),
entryStart DATE,
entryEnd DATE,
contestStart DATE,
contestEnd DATE,
detail TEXT,
poster VARCHAR(255)
);
*/

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContestDao {
    public static List<Contest> getContestList() {
        List<Contest> list = new ArrayList<Contest>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Contest");
            while (rs.next()) {
                Contest contest = new Contest();
                contest.setID(rs.getInt("ID"));
                contest.setName(rs.getString("name"));
                contest.setLevel(rs.getString("level"));
                contest.setCategory(rs.getString("category"));
                contest.setPublisher(rs.getString("publisher"));
                contest.setEntryStart(rs.getDate("entryStart"));
                contest.setEntryEnd(rs.getDate("entryEnd"));
                contest.setContestStart(rs.getDate("contestStart"));
                contest.setContestEnd(rs.getDate("contestEnd"));
                contest.setDetail(rs.getString("detail"));
                contest.setPoster(rs.getString("poster"));
                list.add(contest);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) { /* ignored */}
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) { /* ignored */}
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) { /* ignored */}
            }
        }
        return list;
    }
}
package com.demo.Dao;
import com.demo.Entity.Review;
/*
    CREATE TABLE IF NOT EXISTS Review (
    RID INT PRIMARY KEY,
    UID VARCHAR(255),
    CID INT,
    value INT,
    difficultyContest INT,
    difficultyPrize INT,
    comment TEXT,
    FOREIGN KEY (CID) REFERENCES Contest(ID),
    FOREIGN KEY (UID) REFERENCES Users(UID)
) ENGINE=InnoDB;
 */
import com.demo.Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReviewDao {

    public void insertReview(Review review) {
        String sql = "INSERT INTO Review (RID, UID, CID, value, difficultyContest, difficultyPrize, comment) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, review.getRID());
            stmt.setString(2, review.getUID());
            stmt.setInt(3, review.getCID());
            stmt.setInt(4, review.getValue());
            stmt.setInt(5, review.getDifficultyContest());
            stmt.setInt(6, review.getDifficultyPrize());
            stmt.setString(7, review.getComment());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Review> getAllReviews() {
        List<Review> reviews = new ArrayList<>();
        String sql = "SELECT * FROM Review";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Review review = new Review();
                review.setRID(rs.getInt("RID"));
                review.setUID(rs.getString("UID"));
                review.setCID(rs.getInt("CID"));
                review.setValue(rs.getInt("value"));
                review.setDifficultyContest(rs.getInt("difficultyContest"));
                review.setDifficultyPrize(rs.getInt("difficultyPrize"));
                review.setComment(rs.getString("comment"));
                reviews.add(review);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reviews;
    }

    public void updateReview(Review review) {
        String sql = "UPDATE Review SET UID = ?, CID = ?, value = ?, difficultyContest = ?, difficultyPrize = ?, comment = ? WHERE RID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, review.getUID());
            stmt.setInt(2, review.getCID());
            stmt.setInt(3, review.getValue());
            stmt.setInt(4, review.getDifficultyContest());
            stmt.setInt(5, review.getDifficultyPrize());
            stmt.setString(6, review.getComment());
            stmt.setInt(7, review.getRID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteReview(int RID) {
        String sql = "DELETE FROM Review WHERE RID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, RID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
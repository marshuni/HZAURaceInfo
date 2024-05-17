package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long contestId;
    private int value;
    private int difficultyContest;
    private int difficultyPrize;
    private String comment;

    @ManyToOne
    private Reviewer reviewer;

    public Review() {
    }

    public Review(Long userId, Long contestId, int value, int difficultyContest, int difficultyPrize， String comment, Reviewer reviewer) {
        this.userId = userId;
        this.contestId = contestId;
        this.value = value;
        this.difficultyContest = difficultyContest;
        this.difficultyPrize = difficultyPrize;
        this.comment = comment;
        this.reviewer = reviewer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getContestId() {
        return contestId;
    }

    public void setContestId(Long contestId) {
        this.contestId = contestId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDifficultyContest() {
        return difficultyContest;
    }

    public void setDifficultyContest(int difficultyContest) {
        this.difficultyContest = difficultyContest;
    }

    public int getDifficultyPrize() {
        return difficultyPrize;
    }

    public void setDifficultyPrize(int difficultyPrize) {
        this.difficultyPrize = difficultyPrize;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    // 其它属性和方法
}
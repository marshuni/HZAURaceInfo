package com.demo.Entity;

public class Review {
    private int RID;
    private String UID;
    private int CID;
    private int value;
    private int difficultyContest;
    private int difficultyPrize;
    private String comment;

    // getters and setters
    public int getRID() {
        return RID;
    }

    public void setRID(int RID) {
        this.RID = RID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
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
}
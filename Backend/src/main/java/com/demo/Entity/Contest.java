package com.demo.Entity;

import java.util.Date;

public class Contest {
    private int ID;
    private String name;
    private String level;
    private String category;
    private String publisher;
    private Date entryStart;
    private Date entryEnd;
    private Date contestStart;
    private Date contestEnd;
    private String detail;
    private String poster;

    // getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryStart() {
        return entryStart;
    }

    public void setEntryStart(Date entryStart) {
        this.entryStart = entryStart;
    }

    public Date getEntryEnd() {
        return entryEnd;
    }

    public void setEntryEnd(Date entryEnd) {
        this.entryEnd = entryEnd;
    }

    public Date getContestStart() {
        return contestStart;
    }

    public void setContestStart(Date contestStart) {
        this.contestStart = contestStart;
    }

    public Date getContestEnd() {
        return contestEnd;
    }

    public void setContestEnd(Date contestEnd) {
        this.contestEnd = contestEnd;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
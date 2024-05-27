package com.demo.Entity;

import java.util.Date;

public class ContestMessage {
    private int CMID;
    private Date date;
    private String content;
    private String publisher;
    private int CID;

    public ContestMessage(int CMID, Date date, String content, String publisher, int CID) {
        this.CMID = CMID;
        this.date = date;
        this.content = content;
        this.publisher = publisher;
        this.CID = CID;
    }

    public int getCMID() {
        return CMID;
    }

    public void setCMID(int CMID) {
        this.CMID = CMID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }
}
package com.demo.Entity;

public class Mark {
    private int MID;
    private int CID;
    private String UID;
    private boolean scheduled;

    public Mark(int MID, int CID, String UID, boolean scheduled) {
        this.MID = MID;
        this.CID = CID;
        this.UID = UID;
        this.scheduled = scheduled;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public void setScheduled(boolean scheduled) {
        this.scheduled = scheduled;
    }
}
package com.demo.Entity;

import lombok.Getter;

public class User {
    // getters and setters
    @Getter
    private String UID;
    private boolean Authed;

    public void setUID(String UID) {
        this.UID = UID;
    }

    public boolean getAuthed() {
        return Authed;
    }

    public void setAuthed(boolean Authed) {
        this.Authed = Authed;
    }
}
package com.github.gmetal.domain.model;

import org.parceler.Parcel;

@Parcel
public class ServerSession {

    boolean success;

    String sessionId;

    public ServerSession() {

        success = false;
        sessionId = "";
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {

        this.success = success;
    }

    public String getSessionId() {

        return sessionId;
    }

    public void setSessionId(String sessionId) {

        this.sessionId = sessionId;
    }
}

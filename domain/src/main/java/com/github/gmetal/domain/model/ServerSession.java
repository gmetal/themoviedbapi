package com.github.gmetal.domain.model;

public class ServerSession {

    protected boolean success;

    protected String sessionId;

    public ServerSession() {

        setSuccess(false);
        setSessionId("");
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

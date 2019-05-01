package com.github.gmetal.domain.model;

public class Token {

    protected boolean success;
    protected String expiresAt;

    protected String requestToken;

    public Token() {

        setSuccess(false);
        setExpiresAt("");
        setRequestToken("");
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {

        this.success = success;
    }

    public String getExpiresAt() {

        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {

        this.expiresAt = expiresAt;
    }

    public String getRequestToken() {

        return requestToken;
    }

    public void setRequestToken(String requestToken) {

        this.requestToken = requestToken;
    }
}

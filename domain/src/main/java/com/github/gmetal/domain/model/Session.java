package com.github.gmetal.domain.model;

public class Session {

    public static final int INVALID_SESSION_TYPE = -1;
    public static final int GUEST_SESSION_TYPE = 0;
    public static final int FULL_SESSION_TYPE = 1;

    private String mRequestToken;
    private String mSessionId;

    private String mRequestTokenExpirationDate;
    private String mSessionExpirationDate;

    private int mSessionType;

    public Session(final String sessionId, final int sessionType) {

        if (sessionId != null) {
            mSessionId = sessionId;
            mSessionType = sessionType;
        } else {
            mSessionType = INVALID_SESSION_TYPE;
        }
    }

    public boolean isInvalidSession() {

        return mSessionType == INVALID_SESSION_TYPE;
    }

    public boolean isGuestSession() {

        return mSessionType == GUEST_SESSION_TYPE;
    }

    public boolean isFullSession() {

        return mSessionType == FULL_SESSION_TYPE;
    }

    public int getSessionType() {

        return mSessionType;
    }

    public String getSessionId() {

        return mSessionId;
    }

    public String getRequestToken() {

        return mRequestToken;
    }

    public void updateRequestToken(final String requestToken) {

        mRequestToken = requestToken;
    }
    public void setSessionId(String sessionId) {

        mSessionId = sessionId;
        mSessionType = FULL_SESSION_TYPE;
    }
}

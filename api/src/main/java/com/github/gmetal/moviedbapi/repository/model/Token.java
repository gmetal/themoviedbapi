package com.github.gmetal.moviedbapi.repository.model;

import com.github.gmetal.moviedbapi.model.object.RequestToken;
import org.parceler.Parcel;

@Parcel
public class Token {

    boolean success;
    String expiresAt;

    String requestToken;

    public Token() {

        success = false;
        expiresAt = "";
        requestToken = "";
    }

    public Token(final RequestToken token) {

        success = token.success;
        expiresAt = token.expiresAt;
        requestToken = token.requestToken;
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

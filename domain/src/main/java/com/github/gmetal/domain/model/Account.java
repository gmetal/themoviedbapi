package com.github.gmetal.domain.model;

public class Account {

    protected String avatarHash;
    protected Integer id;
    protected String iso6391;
    protected String iso31661;
    protected String name;
    protected boolean includeAdult;
    protected String username;

    public Account() {

        avatarHash = "";
        id = 0;
        iso6391 = "";
        iso31661 = "";
        name = "";
        includeAdult = false;
        username = "";
    }

    public String getAvatarHash() {

        return avatarHash;
    }

    public void setAvatarHash(String avatarHash) {

        this.avatarHash = avatarHash;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getIso6391() {

        return iso6391;
    }

    public void setIso6391(String iso6391) {

        this.iso6391 = iso6391;
    }

    public String getIso31661() {

        return iso31661;
    }

    public void setIso31661(String iso31661) {

        this.iso31661 = iso31661;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isIncludeAdult() {

        return includeAdult;
    }

    public void setIncludeAdult(boolean includeAdult) {

        this.includeAdult = includeAdult;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }
}

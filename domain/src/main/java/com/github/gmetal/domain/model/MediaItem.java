package com.github.gmetal.domain.model;

public interface MediaItem {

    String IMAGE_PREFIX = "https://image.tmdb.org/t/p/w500/";

    String getMediaId();

    String getImage();

    String getTitle();
}

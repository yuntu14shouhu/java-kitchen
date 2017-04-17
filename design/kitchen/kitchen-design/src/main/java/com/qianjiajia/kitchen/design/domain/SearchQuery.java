package com.qianjiajia.kitchen.design.domain;

import java.util.Date;

public class SearchQuery {
    private String id;

    private Integer searchType;

    private String searchContent;

    private String userId;

    private Date searchTime;

    private Integer searchNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent == null ? null : searchContent.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(Date searchTime) {
        this.searchTime = searchTime;
    }

    public Integer getSearchNumber() {
        return searchNumber;
    }

    public void setSearchNumber(Integer searchNumber) {
        this.searchNumber = searchNumber;
    }
}
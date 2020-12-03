package com.zh.domain;

import java.util.Date;

public class CourseVideo {
    private Integer id;

    private String name;

    private Byte freeView;

    private Integer topicId;

    private Byte flag;

    private String videoUrl;

    private String videoUr2;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getFreeView() {
        return freeView;
    }

    public void setFreeView(Byte freeView) {
        this.freeView = freeView;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoUr2() {
        return videoUr2;
    }

    public void setVideoUr2(String videoUr2) {
        this.videoUr2 = videoUr2 == null ? null : videoUr2.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
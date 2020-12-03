package com.zh.domain;

import java.util.Date;

public class Banner {
    public Banner(Integer id, String imgUrl, Byte flag, Integer type, String targetUrl, Date createTime) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.flag = flag;
        this.type = type;
        this.targetUrl = targetUrl;
        this.createTime = createTime;
    }

    private Integer id;

    private String imgUrl;

    private Byte flag;

    private Integer type;

    private String targetUrl;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
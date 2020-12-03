package com.zh.domain;

public class ToolsItem {
    private Integer id;

    private String name;

    private String toolsUrl;

    private String iconUrl;

    private Integer toolsTypeId;

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

    public String getToolsUrl() {
        return toolsUrl;
    }

    public void setToolsUrl(String toolsUrl) {
        this.toolsUrl = toolsUrl == null ? null : toolsUrl.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getToolsTypeId() {
        return toolsTypeId;
    }

    public void setToolsTypeId(Integer toolsTypeId) {
        this.toolsTypeId = toolsTypeId;
    }
}
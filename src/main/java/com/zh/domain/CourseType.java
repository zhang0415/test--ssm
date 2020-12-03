package com.zh.domain;

public class CourseType {
    private Integer id;

    private String name;

    private Byte falg;

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

    public Byte getFalg() {
        return falg;
    }

    public void setFalg(Byte falg) {
        this.falg = falg;
    }
}
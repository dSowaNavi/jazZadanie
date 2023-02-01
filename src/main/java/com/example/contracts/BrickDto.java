package com.example.contracts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrickDto {

    private Integer id;
    private int code;
    private String color;
    private String name;

    public BrickDto(Integer id, int code, String color, String name) {
        this.id = id;
        this.code = code;
        this.color = color;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.example.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetDto {

    @JsonProperty("set_num")
    private String number;
    private String name;
    private int year;

    public SetDto() {
    }

    public SetDto(String number, String name, int year) {
        this.number = number;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" + number + ", " + name + ", " + year + "}";
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

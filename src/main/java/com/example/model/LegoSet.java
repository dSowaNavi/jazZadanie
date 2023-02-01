package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LegoSet {

    @Id
    private String number;
    private String name;
    private int year;

    @OneToMany(mappedBy = "inventorySet")
    private List<Inventory> inventory;

    public LegoSet() {
    }

    public LegoSet(String number, String name, int year) {
        this.number = number;
        this.name = name;
        this.year = year;
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

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }
}

package com.example.model;

import jakarta.persistence.*;

@Entity
public class Inventory {

    @Id
    private Integer id;
    private Integer partId;
    private Integer setId;

    public Inventory(Integer id, Integer partId, Integer setId, Brick brick, LegoSet set) {
        this.id = id;
        this.partId = partId;
        this.setId = setId;
        this.brick = brick;
        this.inventorySet = set;
    }

    @ManyToOne
    private Brick brick;

    @ManyToOne
    private LegoSet inventorySet;

    public Brick getBrick() {
        return brick;
    }

    public void setBrick(Brick brick) {
        this.brick = brick;
    }

    public LegoSet getSet() {
        return inventorySet;
    }

    public void setSet(LegoSet set) {
        this.inventorySet = set;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getSetId() {
        return setId;
    }

    public void setSetId(Integer setId) {
        this.setId = setId;
    }
}

package com.example.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryDto {

    private Integer id;
    @JsonProperty("part_id")
    private Integer partId;
    @JsonProperty("set_id")
    private Integer setId;

    public InventoryDto(Integer id, Integer partId, Integer setId) {
        this.id = id;
        this.partId = partId;
        this.setId = setId;
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
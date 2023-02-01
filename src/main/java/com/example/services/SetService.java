package com.example.services;

import com.example.contracts.InventoryDto;
import com.example.contracts.SetDto;
import com.example.model.Inventory;
import com.example.model.LegoSet;
import com.example.repositories.BrickRepository;
import com.example.repositories.InventoryRepository;
import com.example.repositories.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SetService {
    @Autowired
    private SetRepository setRepository;
    @Autowired
    private BrickRepository brickRepository;
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<SetDto> getAll() {
        List<SetDto> allSetList = new ArrayList<>();
        for (LegoSet set : setRepository.findAll()) {
            allSetList.add(new SetDto(set.getNumber(), set.getName(), set.getYear()));
        }
        return allSetList;
    }

    public SetDto getBySetNumber(String number){
        LegoSet legoSet = setRepository.findByNumber(number);
        if(legoSet == null) {
            return null;
        } else{
            return new SetDto(legoSet.getNumber(), legoSet.getName(), legoSet.getYear());
        }
//        for (LegoSet set : setRepository.findAll()) {
//            if (set.getNumber() == number) {
//                return new SetDto(set.getNumber(), set.getName(), set.getYear());
//            }
//        }
//        return null;
    }

    public void save(SetDto set) {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber(set.getNumber());
        legoSet.setName(set.getName());
        legoSet.setYear(set.getYear());
        setRepository.save(new LegoSet(set.getNumber(), set.getName(), set.getYear()));
    }

    public void update(int setId, SetDto set) {
        var setToUpdate = setRepository.findById(setId).orElse(null);
        if (setToUpdate!=null) {
            setToUpdate.setName(set.getName());
            setToUpdate.setNumber(set.getNumber());
            setToUpdate.setYear(set.getYear());
            setRepository.save(setToUpdate);
        }
    }

    public void delete(int setId) {
        var set = setRepository.findById(setId).orElse(null);
        if (set!=null) {
            setRepository.delete(set);
        }
    }

    public void addInventory(int setId, int brickId, InventoryDto inventoryDto) {
        var set = setRepository.findById(setId).orElse(null);
        var brick = brickRepository.findById(brickId).orElse(null);
        if (set != null) {
            var inventory = new Inventory(inventoryDto.getId(), inventoryDto.getPartId(), inventoryDto.getSetId(), brick, set);
            set.getInventory().add(inventory);
            setRepository.save(set);
            inventoryRepository.save(inventory);
        }
    }

    public List<InventoryDto> getInventory(int setId) {
        List<InventoryDto> inventoryDtoList = new ArrayList<>();
        var set = setRepository.findById(setId).orElse(null);
        if (set != null) {
            List<Inventory> setInventoryList = set.getInventory();
            for (Inventory inventory : setInventoryList) {
                inventoryDtoList.add(new InventoryDto(inventory.getId(), inventory.getPartId(), inventory.getSetId()));
            }
        }
        return inventoryDtoList;
    }

    public SetRepository getSetRepository() {
        return setRepository;
    }

    public void setSetRepository(SetRepository setRepository) {
        this.setRepository = setRepository;
    }

    public BrickRepository getBrickRepository() {
        return brickRepository;
    }

    public void setBrickRepository(BrickRepository brickRepository) {
        this.brickRepository = brickRepository;
    }
}

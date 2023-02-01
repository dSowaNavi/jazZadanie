package com.example.repositories;

import com.example.model.LegoSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetRepository extends JpaRepository<LegoSet,Integer> {
    LegoSet findByNumber(String string);
}

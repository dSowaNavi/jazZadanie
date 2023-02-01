package com.example.repositories;

import com.example.model.Brick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrickRepository extends JpaRepository<Brick, Integer> {
}

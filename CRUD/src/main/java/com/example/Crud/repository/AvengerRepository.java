package com.example.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Crud.model.Avenger;

public interface AvengerRepository extends JpaRepository<Avenger, Long>{
    
}
package com.willyam.lista.repository;

import com.willyam.lista.models.Lista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepo extends JpaRepository<Lista, Long> {

    
}
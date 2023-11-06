package com.example.ferramenta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ferramenta.entities.OrdineEntity;

@Repository
public interface OrdineRepository extends JpaRepository<OrdineEntity, Long>{

}

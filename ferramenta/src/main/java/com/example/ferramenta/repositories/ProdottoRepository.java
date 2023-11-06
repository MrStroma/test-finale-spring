package com.example.ferramenta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ferramenta.entities.ProdottoEntity;

@Repository
public interface ProdottoRepository extends JpaRepository<ProdottoEntity, Long> {

}

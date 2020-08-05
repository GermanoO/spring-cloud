package com.example.fornecedor.dao;

import com.example.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InfoDAO extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByNome(String nome);

    InfoFornecedor findByEstado (String estado);

    Optional<InfoFornecedor> findById(Long id);



}

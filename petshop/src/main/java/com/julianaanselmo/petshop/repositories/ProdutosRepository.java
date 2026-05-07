package com.julianaanselmo.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianaanselmo.petshop.entities.Produtos;


public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
	
	Produtos findByNome (String nome);

}
package com.julianaanselmo.petshop.repositories;

	
import org.springframework.data.jpa.repository.JpaRepository;

import com.julianaanselmo.petshop.entities.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	Categoria findByNome(String nome);
}
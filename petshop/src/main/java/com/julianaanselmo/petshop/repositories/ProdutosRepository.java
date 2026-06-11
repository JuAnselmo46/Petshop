package com.julianaanselmo.petshop.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.julianaanselmo.petshop.entities.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
	
	Produtos findByNome(String nome);	
	
	List<Produtos> findByCategoriaIdAndAtivoTrue(Integer idCategoria);
}
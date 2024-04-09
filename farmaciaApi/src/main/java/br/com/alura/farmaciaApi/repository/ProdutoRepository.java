package br.com.alura.farmaciaApi.repository;

import br.com.alura.farmaciaApi.model.Produto;
import org.hibernate.Internal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}

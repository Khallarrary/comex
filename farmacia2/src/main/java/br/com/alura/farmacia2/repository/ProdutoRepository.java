package br.com.alura.farmacia2.repository;

import br.com.alura.farmacia2.modelo.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}

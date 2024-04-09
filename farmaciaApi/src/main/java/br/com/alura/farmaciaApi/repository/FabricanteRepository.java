package br.com.alura.farmaciaApi.repository;

import br.com.alura.farmaciaApi.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    Fabricante findByNome(String s);
}

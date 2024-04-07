package br.com.alura.farmacia2;

import br.com.alura.farmacia2.modelo.Produto;
import br.com.alura.farmacia2.principal.Principal;
import br.com.alura.farmacia2.repository.FabricanteRepository;
import br.com.alura.farmacia2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Farmacia2Application implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private FabricanteRepository fabricanteRepository;

	public static void main(String[] args) {
		SpringApplication.run(Farmacia2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(produtoRepository, fabricanteRepository);
		principal.exibeMenu();
	}
}

package br.com.alura.farmacia.testes;

import br.com.alura.farmacia.dao.FabricanteDao;
import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Fabricante;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastroDeFabricante {

    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante("Pfizer");

        EntityManager em = JPAUtil.getEntityMenager();
        FabricanteDao dao = new FabricanteDao(em);

        em.getTransaction().begin();
        dao.cadastrar(fabricante);
        em.getTransaction().commit();
        em.close();
    }
}

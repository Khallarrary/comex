package br.com.alura.farmacia.testes;

import br.com.alura.farmacia.dao.FabricanteDao;
import br.com.alura.farmacia.dao.ProdutoDao;

import br.com.alura.farmacia.modelo.Fabricante;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroDeProdutos {


    public static void main(String[] args) {

        Fabricante lander = new Fabricante("LanderLan");
        Produto produto = new Produto("Testanat", "Anti Hipogonadismo", 170., lander);

        EntityManager em = JPAUtil.getEntityMenager();
        FabricanteDao dao = new FabricanteDao(em);
        ProdutoDao daoProduto = new ProdutoDao(em);


        em.getTransaction().begin();
        dao.cadastrar(lander);
        daoProduto.cadastrar(produto);
        em.getTransaction().commit();
        em.close();


    }

}

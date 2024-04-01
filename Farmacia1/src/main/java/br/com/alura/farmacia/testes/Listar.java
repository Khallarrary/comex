package br.com.alura.farmacia.testes;

import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class Listar {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityMenager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        List<Produto> lista = produtoDao.listar();

        System.out.println(lista);

        em.getTransaction().commit();
        em.close();
    }
}

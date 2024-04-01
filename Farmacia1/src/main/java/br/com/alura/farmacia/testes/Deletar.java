package br.com.alura.farmacia.testes;

import br.com.alura.farmacia.dao.ProdutoDao;
import br.com.alura.farmacia.modelo.Produto;
import br.com.alura.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class Deletar {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityMenager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        Produto produto = produtoDao.buscarPorId(4);
        produtoDao.deletar(produto);


        System.out.println(produtoDao.listar());

        em.getTransaction().commit();
        em.close();
    }
}

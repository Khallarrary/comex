package br.com.alura.farmacia.dao;

import br.com.alura.farmacia.modelo.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }


    public List<Produto> listar() {
        String jpql = "SELECT p FROM Produto p";
        //String hql = "FROM Produto";
        return this.em.createQuery(jpql, Produto.class).getResultList();
    }

    public Produto buscarPorId(int id) {
        return this.em.find(Produto.class, id);
    }

    public void atualizar(Produto produto){
        this.em.merge(produto);
    }

    public void deletar(Produto produto){
        this.em.remove(produto);
    }

}
package br.com.famarcia.service;

import br.com.famarcia.DAO.ConnectionFactory;
import br.com.famarcia.DAO.produtoDao;
import br.com.famarcia.modelo.Produto;

import java.sql.Connection;
import java.util.Set;

public class ProdutoService {

    private ConnectionFactory connection;

    public ProdutoService() {
        this.connection = new ConnectionFactory();
    }


    public Set<Produto> listarPodutosCadatrados() {
        Connection conn = connection.recuperarConexao();
        return new produtoDao(conn).listar();
    }

    public void abrir(Produto produto) {
        Connection conn = connection.recuperarConexao();
        new produtoDao(conn).salvar(produto);

    }

    public void alterarPreco(Integer id, double valor) {
        Connection conn = connection.recuperarConexao();
        new produtoDao(conn).alterar(id, valor);
    }

    public void excluir (Integer id) {
        Connection conn = connection.recuperarConexao();
        new produtoDao(conn).deletar(id);
    }


}


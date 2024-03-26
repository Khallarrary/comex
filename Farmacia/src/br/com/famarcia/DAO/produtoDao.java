package br.com.famarcia.DAO;

import br.com.famarcia.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class produtoDao {

    private Connection conn;

    public produtoDao(Connection connection) {
        this.conn = connection;
    }

    public void salvar(Produto produto) {
        String sql = "INSERT INTO produto (id, nome, preco, fabricante) VALUES (?, ?, ?, ?)";

        try (
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, produto.getId());
            stmt.setString(2, produto.getNome());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getFabricante());

            stmt.execute();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar produto no banco de dados", e);
        }

    }

    public Set<Produto> listar() {
        PreparedStatement ps = null;
        ResultSet resultSet;
        Set<Produto> produtos = new HashSet<>();

        String sql = "SELECT * FROM produto";

        try {
            ps = conn.prepareStatement(sql);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                double preco = resultSet.getDouble(2);
                String nome = resultSet.getNString(3);
                String fabricante = resultSet.getNString(4);
                Produto produto =
                        new Produto(id, preco, nome, fabricante);

                produtos.add(new Produto(id, preco, nome, fabricante));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;

    }
        public void alterar(Integer id, double valor) {
            PreparedStatement ps;
            String sql = "UPDATE produto SET preco = ? WHERE id = ?";

            try {
                ps= conn.prepareStatement(sql);

                ps.setDouble(1, valor);
                ps.setInt(2, id);

                ps.execute();
                ps.close();
                conn.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void deletar(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
           ps.execute();
           ps.close();
           conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


package br.com.famarcia.modelo;

import br.com.famarcia.DAO.ConnectionFactory;

public class Produto {

    private ConnectionFactory connection;
    Produto(){
        this.connection = new ConnectionFactory();
    }

        private int id;
        private double preco;
        private String nome;
        private String fabricante;


    public Produto(int id, double preco, String nome, String fabricante) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.fabricante = fabricante;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}

package br.com.alura.farmaciaApi.model;

import br.com.alura.farmaciaApi.dto.DadosAtualizarProdutoDTO;
import br.com.alura.farmaciaApi.dto.DadosCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne
    private Fabricante fabricante;

    public Produto(DadosCadastroDTO dadosCadastroDTO, Fabricante fabricante) {
        this.nome = dadosCadastroDTO.nomeProduto();
        this.descricao = dadosCadastroDTO.descricaoProduto();
        this.preco = dadosCadastroDTO.precoProduto();
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void atualizar(DadosAtualizarProdutoDTO produtoDTO) {
        if(produtoDTO.descricaoProduto() != null){
            this.descricao = produtoDTO.descricaoProduto();
        }
        if(produtoDTO.precoProduto() > 0) {
            this.preco = produtoDTO.precoProduto();
        }
    }
}

package br.com.alura.farmaciaApi.dto;

import br.com.alura.farmaciaApi.model.Produto;

public record DadosRetornoDTO(String nomeFabricante, String nomeProduto, String descricaProduto, double precoProduto) {
        public DadosRetornoDTO(Produto produto){
            this(produto.getFabricante().getNome(), produto.getNome(),
                    produto.getDescricao(),
                    produto.getPreco());
        }
}

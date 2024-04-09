package br.com.alura.farmaciaApi.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarProdutoDTO(
        @NotNull
        int id,
        String descricaoProduto,
        double precoProduto) {
}

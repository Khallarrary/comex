package br.com.alura.farmaciaApi.model;

import br.com.alura.farmaciaApi.dto.DadosCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fabricantes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    public Fabricante(DadosCadastroDTO dadosCadastroDTO) {
        this.nome = dadosCadastroDTO.nomeFabricante();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

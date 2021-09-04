package br.com.brenonoccioli.transacao.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Estabelecimento {

    @NotBlank
    @Column(name="estabelecimento_nome", nullable = false)
    private String nome;

    @NotBlank
    @Column(name = "estabelecimento_cidade", nullable = false)
    private String cidade;

    @NotBlank
    @Column(name = "estabelecimento_endereco", nullable = false)
    private String endereco;

    @Deprecated
    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

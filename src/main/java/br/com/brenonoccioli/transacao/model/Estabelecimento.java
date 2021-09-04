package br.com.brenonoccioli.transacao.model;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class Estabelecimento {

    @NotBlank
    @Column(name = "estab_nome", nullable = false)
    private String nome;

    @NotBlank
    @Column(name = "estab_cidade", nullable = false)
    private String cidade;

    @NotBlank
    @Column(name = "estab_endereco", nullable = false)
    private String endereco;

    @Deprecated
    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

}

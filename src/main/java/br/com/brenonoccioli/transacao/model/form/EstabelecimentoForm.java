package br.com.brenonoccioli.transacao.model.form;

import br.com.brenonoccioli.transacao.model.Estabelecimento;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoForm {
    @NotBlank
    private String nome;

    @NotBlank
    private String cidade;

    @NotBlank
    private String endereco;

    @Deprecated
    public EstabelecimentoForm() {
    }

    public EstabelecimentoForm(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public Estabelecimento toModel(){
        return new Estabelecimento(nome,cidade,endereco);
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
}

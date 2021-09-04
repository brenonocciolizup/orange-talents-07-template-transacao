package br.com.brenonoccioli.transacao.model.form;

import br.com.brenonoccioli.transacao.model.Estabelecimento;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoForm {

    private String nome;

    private String cidade;

    private String endereco;


    public EstabelecimentoForm() {
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

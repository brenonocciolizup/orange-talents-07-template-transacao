package br.com.brenonoccioli.transacao.model.form;

import br.com.brenonoccioli.transacao.model.Cartao;

import javax.validation.constraints.NotBlank;

public class CartaoForm {

    private String id;

    private String email;

    public CartaoForm() {
    }

    public Cartao toModel(){
        return new Cartao(id, email);
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

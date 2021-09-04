package br.com.brenonoccioli.transacao.model.form;

import br.com.brenonoccioli.transacao.model.Cartao;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class CartaoForm {
    @NotBlank
    private String id;

    @NotBlank
    private String email;

    @Deprecated
    public CartaoForm() {
    }

    public CartaoForm(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public Cartao toModel(){
        return new Cartao(id, email);
    }
}

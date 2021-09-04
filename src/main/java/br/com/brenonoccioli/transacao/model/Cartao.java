package br.com.brenonoccioli.transacao.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Cartao {
    @NotBlank
    @Column(name = "cartao_id", nullable = false)
    private String id;

    @NotBlank
    @Column(name = "cartao_email", nullable = false)
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }
}

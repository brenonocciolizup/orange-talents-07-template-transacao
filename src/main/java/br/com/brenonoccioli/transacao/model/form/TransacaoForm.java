package br.com.brenonoccioli.transacao.model.form;

import br.com.brenonoccioli.transacao.model.Cartao;
import br.com.brenonoccioli.transacao.model.Estabelecimento;
import br.com.brenonoccioli.transacao.model.Transacao;
import org.springframework.lang.UsesSunHttpServer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoForm {

    @NotBlank
    private String id;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private EstabelecimentoForm estabelecimento;

    @NotNull
    private CartaoForm cartao;

    @NotNull
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacaoForm(){}

    public TransacaoForm(String id, BigDecimal valor, EstabelecimentoForm estabelecimento, CartaoForm cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Transacao toModel(){
        return new Transacao(id, valor, estabelecimento.toModel(), cartao.toModel(), efetivadaEm);
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoForm getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoForm getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}

package br.com.brenonoccioli.transacao.controller.dto;

import br.com.brenonoccioli.transacao.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDto {

    private String id;

    private BigDecimal valor;

    private  EstabelecimentoDto estabelecimento;

    private LocalDateTime efetivadaEm;

    public TransacaoDto(Transacao transacao){
        this.id = transacao.getId();
        this.valor = transacao.getValor();
        this.estabelecimento = new EstabelecimentoDto(transacao.getEstabelecimento());
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoDto getEstabelecimento() {
        return estabelecimento;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}

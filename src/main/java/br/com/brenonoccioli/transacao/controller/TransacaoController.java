package br.com.brenonoccioli.transacao.controller;

import br.com.brenonoccioli.transacao.model.Cartao;
import br.com.brenonoccioli.transacao.model.Transacao;
import br.com.brenonoccioli.transacao.controller.dto.TransacaoDto;
import br.com.brenonoccioli.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cartoes")
public class TransacaoController {

    @Autowired
    TransacaoRepository transacaoRepository;

    @GetMapping("/{id}/transacoes")
    public ResponseEntity listaUltimasTransacoes(@PathVariable("id") String id){
        List<Transacao> ultimasTransacoes = transacaoRepository.findTop10ByCartaoIdOrderByEfetivadaEmDesc(id);
        if(ultimasTransacoes.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(ultimasTransacoes.stream().map(TransacaoDto::new).collect(Collectors.toList()));
    }
}

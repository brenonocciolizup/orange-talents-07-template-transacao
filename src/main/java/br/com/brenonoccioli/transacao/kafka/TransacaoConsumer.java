package br.com.brenonoccioli.transacao.kafka;

import br.com.brenonoccioli.transacao.model.Transacao;
import br.com.brenonoccioli.transacao.model.form.TransacaoForm;
import br.com.brenonoccioli.transacao.repository.TransacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

@Component
public class TransacaoConsumer {
    @Autowired
    TransacaoRepository repository;

    Logger log = LoggerFactory.getLogger(TransacaoConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.transactions}", containerFactory = "kafkaListenerContainerFactory")
    public void escuta(@NotNull TransacaoForm form){
        Transacao transacao = form.toModel();
        repository.save(transacao);
        log.info(transacao.toString());

    }
}

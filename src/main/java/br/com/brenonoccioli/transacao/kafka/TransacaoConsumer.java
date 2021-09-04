package br.com.brenonoccioli.transacao.kafka;

import br.com.brenonoccioli.transacao.model.Transacao;
import br.com.brenonoccioli.transacao.model.form.TransacaoForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {

    Logger log = LoggerFactory.getLogger(TransacaoConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.transactions}", containerFactory = "kafkaListenerContainerFactory")
    public void escuta(TransacaoForm form){
        Transacao transacao = form.toModel();
        log.info(transacao.toString());
    }
}

package br.com.frovas.diomicrosservicokafka.service;

import br.com.frovas.diomicrosservicokafka.data.PedidoData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SalvarPedidoService {

    @KafkaListener(topics = "SalvarPedido", groupId = "MicrosservicoSalvaPedido")
    private void executar(ConsumerRecord<String, String> record) {

        log.info("Chave = {}", record.key());
        log.info("Cabeçalho = {}", record.headers());
        log.info("Partição = {}", record.partition());

        String strDados = record.value();

        ObjectMapper mapper = new ObjectMapper();
        PedidoData pedido;

        try {
            pedido = mapper.readValue(strDados, PedidoData.class);
        } catch (JsonProcessingException e) {
            log.error("Falha ao converter evento [dado={}]", strDados, e);
            return;
        }

        log.info("Evento Recebido = {}", pedido);

        // Gravar no BD
        // Responder para a fila de que o pedido foi salvo
    }

    private void gravar(PedidoData pedido) {
        //gravar no BD
    }

}

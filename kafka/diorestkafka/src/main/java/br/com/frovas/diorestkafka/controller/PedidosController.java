package br.com.frovas.diorestkafka.controller;

import br.com.frovas.diorestkafka.data.PedidoData;
import br.com.frovas.diorestkafka.services.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService eventoService;

    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedido) {

        eventoService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }
}

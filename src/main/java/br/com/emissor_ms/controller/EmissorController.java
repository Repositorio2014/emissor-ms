package br.com.emissor_ms.controller;

import br.com.emissor_ms.dtoResponse.ClienteCartao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cartao")
public class EmissorController {

    @GetMapping(value = "/getCartaoId")
    public String getCartao(){
        return "Retorno da API Emissor-ms com getCartão!";
    }

    @PostMapping("/novo")
    public ResponseEntity<ClienteCartao> novaCliente(@RequestBody ClienteCartao cliente){
        return ResponseEntity.ok(cliente);
    }
}

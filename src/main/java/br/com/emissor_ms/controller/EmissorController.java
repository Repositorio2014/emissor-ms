package br.com.emissor_ms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cartao")
public class EmissorController {

    @GetMapping(value = "/")
    public String cartao(){
        return "Retorno da API Emissor-ms";
    }
}

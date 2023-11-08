package com.unifacisa.tap.homebroker.controller;

import com.unifacisa.tap.homebroker.entity.Acao;
import com.unifacisa.tap.homebroker.service.AcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acoes")
public class AcaoController {

    @Autowired
    private AcaoService acaoService;

    @GetMapping
    public ResponseEntity<List<Acao>> listarAcoes() {
        List<Acao> acoes = acaoService.listarAcoes();
        return ResponseEntity.ok(acoes);
    }

    @PostMapping("/salvar")
    public ResponseEntity<List<Acao>> salvarAcoes() {
        try {
            // Chame o método de salvamento do serviço para salvar a entidade Acao
            List<Acao> acoesSalvas = acaoService.salvarAcao();

            // Aqui você pode retornar uma resposta de sucesso, por exemplo, com o ID da ação salva
            return ResponseEntity.ok(acoesSalvas);
        } catch (Exception e) {
            // Lide com erros e exceções adequadamente
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
}
}

package com.example.fornecedor.controller;

import com.example.fornecedor.model.InfoFornecedor;
import com.example.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{estado}")
    private InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
        InfoFornecedor fornecedor = infoService.getInfoPorEstado(estado);
        return fornecedor;
    }

}

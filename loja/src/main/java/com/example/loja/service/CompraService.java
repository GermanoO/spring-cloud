package com.example.loja.service;


import com.example.loja.client.FornecedorClient;
import com.example.loja.controller.dto.CompraDTO;
import com.example.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

//    @Autowired
//    private RestTemplate client;

//    @Autowired
//    private DiscoveryClient eurekaClient;

    @Autowired
    private FornecedorClient fornecedorClient;

    public void realizaCompra(CompraDTO compra) {

//        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://fornecedor/info/"+compra.getEndereco().getEstado(), HttpMethod.GET, null, InfoFornecedorDTO.class);
//        System.out.println(exchange.getBody().getEndereco());
//
//        eurekaClient.getInstances("fornecedor").stream().forEach(fornecedor -> {
//            System.out.println("localhost: " + fornecedor.getPort());
//        });

        InfoFornecedorDTO infoFornecedorDTO = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
        System.out.println(infoFornecedorDTO.getEndereco());

    }
}

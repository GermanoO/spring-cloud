package com.example.fornecedor.service;

import com.example.fornecedor.dao.InfoDAO;
import com.example.fornecedor.model.InfoFornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoDAO infoDAO;

    public InfoFornecedor getInfoPorEstado(String estado) {
        InfoFornecedor info = infoDAO.findByNome("flores");

        InfoFornecedor info2 = infoDAO.findById(1L).orElse(null);

        return infoDAO.findByEstado(estado);
    }

}

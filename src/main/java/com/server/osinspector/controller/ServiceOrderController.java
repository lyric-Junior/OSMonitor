package com.server.osinspector.controller;

import com.server.osinspector.model.entitys.FilterBuilder;
import com.server.osinspector.model.entitys.TOS;
import com.server.osinspector.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class ServiceOrderController {

    @Autowired
    private ServiceOrderService service;

    @GetMapping("/listarOs")
    public ResponseEntity<List<TOS>> listarOs() {
        return ResponseEntity.ok(service.listarOs());
    }

    @GetMapping("/listarPorFiltro")
    public ResponseEntity<List<TOS>> listarPorFiltro(FilterBuilder filterBuilder) {
        return ResponseEntity.ok(service.listarPorFiltro(filterBuilder));
    }
}

package com.server.osinspector.service;

import com.server.osinspector.model.entitys.FilterBuilder;
import com.server.osinspector.model.entitys.TOS;
import com.server.osinspector.repository.ServiceOrderRepository;
import com.server.osinspector.repository.TOSSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public class ServiceOrderService {

    private final ServiceOrderRepository repository;

    public ServiceOrderService(ServiceOrderRepository repository) {
        this.repository = repository;
    }

    public List<TOS> listarOs() {
        return repository.findAll();
    }

    public List<TOS> listarPorFiltro(FilterBuilder filterBuilder) {

        Specification<TOS> list = TOSSpec.montarFiltro(filterBuilder);
        return repository.findAll(list);
    }


}

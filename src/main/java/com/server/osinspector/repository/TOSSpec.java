package com.server.osinspector.repository;

import com.server.osinspector.model.entitys.FilterBuilder;
import com.server.osinspector.model.entitys.TOS;
import org.springframework.data.jpa.domain.Specification;

public class TOSSpec {

    public static Specification<TOS> montarFiltro(FilterBuilder filterBuilder) {
        Specification<TOS> spec = Specification.where(
                (root, query, cb) -> cb.conjunction());

        if (filterBuilder.getVendedor() != null && !filterBuilder.getVendedor().isEmpty()) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("vendedor"), filterBuilder.getVendedor()));
        }

        if (filterBuilder.getFuncionario() != null && !filterBuilder.getFuncionario().isEmpty()) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("funcionario"), filterBuilder.getFuncionario()));
        }

        if (filterBuilder.getCliente() != null && !filterBuilder.getCliente().isEmpty()) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("cliente"), filterBuilder.getCliente()));
        }

        return spec;
    }
}

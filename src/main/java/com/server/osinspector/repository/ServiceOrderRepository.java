package com.server.osinspector.repository;

import com.server.osinspector.model.dto.FilterBuilder;
import com.server.osinspector.model.entitys.TOS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceOrderRepository
        extends JpaRepository<TOS, Long> {

    Optional<TOS> findById(int controle);

    public Specification<TOS> montarFiltro(FilterBuilder filterBuilder) {
        Specification<TOS> spec = Specification.where(null);

        if (filterBuilder.getVendedor() != null) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("nomeVendedor"), filtro.getNomeVendedor()));
        }

        if (filtro.getNomeFuncionario() != null) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("nomeFuncionario"), filtro.getNomeFuncionario()));
        }

        if (filtro.getNomeCliente() != null) {
            spec = spec.and((root, query, cb) ->
                    cb.equal(root.get("nomeCliente"), filtro.getNomeCliente()));
        }

        return spec;
    }
}

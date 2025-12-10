package br.com.ufape.gestaofinanceiraapi.mappers.impl;

import br.com.ufape.gestaofinanceiraapi.dto.despesa.DespesaCreateDTO;
import br.com.ufape.gestaofinanceiraapi.mappers.Mapper;
import br.com.ufape.gestaofinanceiraapi.entities.DespesaEntity;
import org.springframework.stereotype.Component;

@Component
public class DespesaCreateMapperImpl implements Mapper<DespesaEntity, DespesaCreateDTO> {

    @Override
    public DespesaCreateDTO mapTo(DespesaEntity despesaEntity) {
        DespesaCreateDTO dto = new DespesaCreateDTO();
        dto.setData(despesaEntity.getData());
        dto.setValor(despesaEntity.getValor());
        dto.setDestinoPagamento(despesaEntity.getDestinoPagamento());
        dto.setObservacoes(despesaEntity.getObservacoes());
        return dto;
    }

    @Override
    public DespesaEntity mapFrom(DespesaCreateDTO dto) {
        DespesaEntity entity = new DespesaEntity();
        entity.setData(dto.getData());
        entity.setValor(dto.getValor());
        entity.setDestinoPagamento(dto.getDestinoPagamento());
        entity.setObservacoes(dto.getObservacoes());
        return entity;
    }
}

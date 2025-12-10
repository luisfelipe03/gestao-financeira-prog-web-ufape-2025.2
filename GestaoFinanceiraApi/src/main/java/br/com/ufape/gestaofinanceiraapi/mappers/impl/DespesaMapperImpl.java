package br.com.ufape.gestaofinanceiraapi.mappers.impl;

import br.com.ufape.gestaofinanceiraapi.dto.despesa.DespesaDTO;
import br.com.ufape.gestaofinanceiraapi.mappers.Mapper;
import br.com.ufape.gestaofinanceiraapi.entities.DespesaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DespesaMapperImpl implements Mapper<DespesaEntity, DespesaDTO> {
    private final ModelMapper modelMapper;

    public DespesaMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public DespesaDTO mapTo(DespesaEntity despesaEntity) {
        DespesaDTO dto = modelMapper.map(despesaEntity, DespesaDTO.class);
        dto.setCategoria(despesaEntity.getCategoria()
                .getNome());
        return dto;
    }

    @Override
    public DespesaEntity mapFrom(DespesaDTO despesaDTO) {
        return modelMapper.map(despesaDTO, DespesaEntity.class);
    }
}
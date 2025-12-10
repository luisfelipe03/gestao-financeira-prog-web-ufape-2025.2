package br.com.ufape.gestaofinanceiraapi.mappers.impl;

import br.com.ufape.gestaofinanceiraapi.dto.receita.ReceitaDTO;
import br.com.ufape.gestaofinanceiraapi.mappers.Mapper;
import br.com.ufape.gestaofinanceiraapi.entities.ReceitaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ReceitaMapperImpl implements Mapper<ReceitaEntity, ReceitaDTO> {
    private final ModelMapper modelMapper;

    public ReceitaMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.modelMapper.typeMap(ReceitaDTO.class, ReceitaEntity.class)
                .addMappings(mapper -> mapper.skip(ReceitaEntity::setCategoria));
    }

    @Override
    public ReceitaDTO mapTo(ReceitaEntity receitaEntity) {
        ReceitaDTO dto = modelMapper.map(receitaEntity, ReceitaDTO.class);
        dto.setCategoria(receitaEntity.getCategoria()
                .getNome());
        return dto;

    }

    @Override
    public ReceitaEntity mapFrom(ReceitaDTO receitaDTO) {
        return modelMapper.map(receitaDTO, ReceitaEntity.class);
    }
}

package br.com.ufape.gestaofinanceiraapi.mappers.impl;

import br.com.ufape.gestaofinanceiraapi.dto.categoria.CategoriaDTO;
import br.com.ufape.gestaofinanceiraapi.mappers.Mapper;
import br.com.ufape.gestaofinanceiraapi.entities.CategoriaEntity;
import br.com.ufape.gestaofinanceiraapi.entities.enums.CategoriaType;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapperImpl implements Mapper<CategoriaEntity, CategoriaDTO> {

    private final ModelMapper modelMapper;

    public CategoriaMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoriaDTO mapTo(CategoriaEntity categoriaEntity) {
        CategoriaDTO dto = modelMapper.map(categoriaEntity, CategoriaDTO.class);
        dto.setTipo(categoriaEntity.getTipo().name());

        return dto;
    }

    @Override
    public CategoriaEntity mapFrom(CategoriaDTO categoriaDTO) {
        CategoriaEntity entity =  modelMapper.map(categoriaDTO, CategoriaEntity.class);
        entity.setTipo(CategoriaType.valueOf(categoriaDTO.getTipo()));

        return entity;
    }
}

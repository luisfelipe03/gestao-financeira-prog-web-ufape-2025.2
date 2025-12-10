package br.com.ufape.gestaofinanceiraapi.mappers.impl;

import br.com.ufape.gestaofinanceiraapi.dto.user.UserDTO;
import br.com.ufape.gestaofinanceiraapi.mappers.Mapper;
import br.com.ufape.gestaofinanceiraapi.entities.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements Mapper<UserEntity, UserDTO> {
    private final ModelMapper modelMapper;

    public UserMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDTO mapTo(UserEntity userEntity) {
        return modelMapper.map(userEntity, UserDTO.class);
    }

    @Override
    public UserEntity mapFrom(UserDTO userDTO) {
        return modelMapper.map(userDTO, UserEntity.class);
    }
}

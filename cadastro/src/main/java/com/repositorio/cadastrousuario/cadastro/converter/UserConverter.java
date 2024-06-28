package com.repositorio.cadastrousuario.cadastro.converter;

import com.repositorio.cadastrousuario.cadastro.entity.AddressEntity;
import com.repositorio.cadastrousuario.cadastro.entity.UserEntity;
import com.repositorio.cadastrousuario.cadastro.request.UserRequestDTO;
import com.repositorio.cadastrousuario.cadastro.response.AddressResponseDTO;
import com.repositorio.cadastrousuario.cadastro.response.UserResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    // Converter requisição DTO para Entity.
    public UserEntity forUserEntity(UserRequestDTO userRequestDTO) {
        return UserEntity.builder()
                .name(userRequestDTO.getName())
                .email(userRequestDTO.getEmail())
                .document(userRequestDTO.getDocument())
                .address(forAddressEntity(userRequestDTO.getAddress()))
                .build();
    }

    // converter EndereçoRequestDTO para endereço Entity.
    private AddressEntity forAddressEntity(AddressEntity addressEntity) {
        return AddressEntity.builder()
                .city(addressEntity.getCity())
                .street(addressEntity.getStreet())
                .number(addressEntity.getNumber())
                .neighborhood(addressEntity.getNeighborhood())
                .complement(addressEntity.getComplement())
                .cep(addressEntity.getCep())
                .build();
    }

    // Converter Entity para Response -> levar a resposta para o método.
    public UserResponseDTO forUserResponseDTO(UserEntity userEntity) {
        return UserResponseDTO.builder()
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .document(userEntity.getDocument())
                .address(forAddressResponseDTO(userEntity.getAddress()))
                .build();
    }

    private AddressResponseDTO forAddressResponseDTO(AddressEntity addressEntity) {
        return AddressResponseDTO.builder()
                .city(addressEntity.getCity())
                .street(addressEntity.getStreet())
                .number(addressEntity.getNumber())
                .neighborhood(addressEntity.getNeighborhood())
                .complement(addressEntity.getComplement())
                .cep(addressEntity.getCep())
                .build();
    }



}

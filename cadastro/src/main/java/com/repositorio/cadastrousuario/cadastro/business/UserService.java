package com.repositorio.cadastrousuario.cadastro.business;

import com.repositorio.cadastrousuario.cadastro.converter.UserConverter;
import com.repositorio.cadastrousuario.cadastro.entity.UserEntity;
import com.repositorio.cadastrousuario.cadastro.repository.UserRepository;
import com.repositorio.cadastrousuario.cadastro.request.UserRequestDTO;
import com.repositorio.cadastrousuario.cadastro.response.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private UserConverter userConverter;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.saveAndFlush(user);
    }

    // criar exceção personalizadas.
    public UserResponseDTO toRecordUser(UserRequestDTO userRequestDTO) {

        try {
            UserEntity userEntity = saveUser(userConverter.forUserEntity(userRequestDTO));
            return userConverter.forUserResponseDTO(userEntity);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gravar dados de usuário.");
        }

    }

}

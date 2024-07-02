package com.repositorio.cadastrousuario.cadastro.business;

import com.repositorio.cadastrousuario.cadastro.api.converter.UserConverter;
import com.repositorio.cadastrousuario.cadastro.entity.UserEntity;
import com.repositorio.cadastrousuario.cadastro.repository.UserRepository;
import com.repositorio.cadastrousuario.cadastro.api.request.UserRequestDTO;
import com.repositorio.cadastrousuario.cadastro.api.response.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserConverter userConverter;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.saveAndFlush(user);
    }

    // criar exceção personalizadas.
    public UserResponseDTO recordUsers(UserRequestDTO userRequestDTO) {
        try {
            UserEntity userEntity = saveUser(userConverter.forUserEntity(userRequestDTO));
            return userConverter.forUserResponseDTO(userEntity);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gravar dados de usuário.", e);
        }
    }

    public UserResponseDTO findUserData(String email) {
        return userConverter.forUserResponseDTO(userRepository.findByEmail(email));
    }

    public void deleteUserData(String email) {
        userRepository.deleteByEmail(email);
    }


}

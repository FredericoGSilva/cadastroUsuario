package com.repositorio.cadastrousuario.cadastro.business;

<<<<<<< HEAD
import com.repositorio.cadastrousuario.cadastro.converter.UserConverter;
import com.repositorio.cadastrousuario.cadastro.entity.UserEntity;
import com.repositorio.cadastrousuario.cadastro.repository.UserRepository;
import com.repositorio.cadastrousuario.cadastro.request.UserRequestDTO;
import com.repositorio.cadastrousuario.cadastro.response.UserResponseDTO;
=======
import com.repositorio.cadastrousuario.cadastro.entity.UserEntity;
import com.repositorio.cadastrousuario.cadastro.repository.UserRepository;
>>>>>>> e7c02a54a149b16a0265205725a48160c1c76c26
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

<<<<<<< HEAD
    private UserConverter userConverter;

=======
>>>>>>> e7c02a54a149b16a0265205725a48160c1c76c26
    public UserEntity saveUser(UserEntity user) {
        return userRepository.saveAndFlush(user);
    }

<<<<<<< HEAD
    // criar exceção personalizadas.
    public UserResponseDTO toRecordUser(UserRequestDTO userRequestDTO) {

        try {
            UserEntity userEntity = saveUser(userConverter.forUserEntity(userRequestDTO));
            return userConverter.forUserResponseDTO(userEntity);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gravar dados de usuário.");
        }

    }

=======
>>>>>>> e7c02a54a149b16a0265205725a48160c1c76c26
}

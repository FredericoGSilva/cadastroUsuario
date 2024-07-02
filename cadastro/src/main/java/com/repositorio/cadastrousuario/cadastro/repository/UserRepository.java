package com.repositorio.cadastrousuario.cadastro.repository;

import com.repositorio.cadastrousuario.cadastro.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}

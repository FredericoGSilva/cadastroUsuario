package com.repositorio.cadastrousuario.cadastro.api.controller;

import com.repositorio.cadastrousuario.cadastro.api.request.UserRequestDTO;
import com.repositorio.cadastrousuario.cadastro.api.response.UserResponseDTO;
import com.repositorio.cadastrousuario.cadastro.business.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<UserResponseDTO> recordUserData(@RequestBody UserRequestDTO userRequestDTO) {
        return ResponseEntity.ok(userService.recordUsers(userRequestDTO));
    }

    @GetMapping()
    public ResponseEntity<UserResponseDTO> findUserByEmail(@RequestParam ("email") String email) {
        return ResponseEntity.ok(userService.findUserData(email));
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteUserData(@RequestParam ("email") String email) {
        userService.deleteUserData(email);
        return ResponseEntity.accepted().build();
    }

}

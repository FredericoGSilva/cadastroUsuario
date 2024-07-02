package com.repositorio.cadastrousuario.cadastro.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDTO {

    private Long id;

    private String name;

    private String email;

    private String document;

    private AddressResponseDTO address;

}

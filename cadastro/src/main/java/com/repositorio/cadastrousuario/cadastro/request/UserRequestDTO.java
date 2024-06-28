package com.repositorio.cadastrousuario.cadastro.request;

import com.repositorio.cadastrousuario.cadastro.entity.AddressEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO {

    private String name;

    private String email;

    private String document;

    private AddressEntity address;
}

package com.repositorio.cadastrousuario.cadastro.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponseDTO {

    private Long id;

    private String city;

    private String street;

    private String number;

    private String neighborhood;

    private String complement;

    private String cep;

}

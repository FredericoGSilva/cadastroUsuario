package com.repositorio.cadastrousuario.cadastro.api.request;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressRequestDTO {

    private String city;

    private String street;

    private String number;

    private String neighborhood;

    private String complement;

    private String cep;

}

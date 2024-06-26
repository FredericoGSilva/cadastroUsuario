package com.repositorio.cadastrousuario.cadastro.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
@Entity
@Builder
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua")
    private String street;

    @Column(name = "numero")
    private String number;

    @Column(name = "bairro")
    private String Neighborhood;

    @Column(name = "complemento")
    private String complement;

    private String cep;

}

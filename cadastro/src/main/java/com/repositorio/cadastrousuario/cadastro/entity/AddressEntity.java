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

<<<<<<< HEAD
    @Column(name = "cidade")
    private String city;

=======
>>>>>>> e7c02a54a149b16a0265205725a48160c1c76c26
    @Column(name = "rua")
    private String street;

    @Column(name = "numero")
    private String number;

    @Column(name = "bairro")
<<<<<<< HEAD
    private String neighborhood;
=======
    private String Neighborhood;
>>>>>>> e7c02a54a149b16a0265205725a48160c1c76c26

    @Column(name = "complemento")
    private String complement;

    private String cep;

}

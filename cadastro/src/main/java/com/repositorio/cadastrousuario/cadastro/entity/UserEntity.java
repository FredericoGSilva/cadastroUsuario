package com.repositorio.cadastrousuario.cadastro.entity;

import jakarta.persistence.*;
import lombok.*;
<<<<<<< HEAD
import lombok.Builder;
=======
>>>>>>> e7c02a54a149b16a0265205725a48160c1c76c26

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@Entity
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "documento", nullable = false)
    private String document;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private AddressEntity address;


}

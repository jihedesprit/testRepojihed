package com.example.testjihedbouabid.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "Client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    long idClient;
    String identifiant;
    LocalDate datePremiereVisite;
    @ManyToMany(
            mappedBy  ="clients",cascade = CascadeType.ALL)
    Set<Menu> menuCli;
}

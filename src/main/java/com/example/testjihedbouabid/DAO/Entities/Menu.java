package com.example.testjihedbouabid.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Table(name = "Menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
    long idMenu;
    String libelleMennu;
    Float prixTotal;
     @ManyToMany(cascade = CascadeType.ALL)
    Set<Client> clients;
     @OneToMany(mappedBy = "menuComp",cascade = CascadeType.ALL)
    Set<Composant> comp;


}

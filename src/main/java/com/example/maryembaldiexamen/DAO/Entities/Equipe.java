package com.example.maryembaldiexamen.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nomEquipe;
    LocalDate dateCreation;
    @OneToMany (mappedBy = "equipe", cascade = CascadeType.ALL)
    Set <Joueur> joueurs;
    @OneToMany (mappedBy = "E")
    Set <Rencontre> rencontres;

}

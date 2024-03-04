package com.example.maryembaldiexamen.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rencontre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate dateMatch;
    int nbre_but;
    String nomStade;
    Niveau niveau;
    @ManyToOne
    Arbitre arbitre;
    @ManyToOne
    Equipe E;
}

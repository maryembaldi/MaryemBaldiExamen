package com.example.maryembaldiexamen.DAO.Repositories;

import com.example.maryembaldiexamen.DAO.Entities.Arbitre;
import com.example.maryembaldiexamen.DAO.Entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
    Equipe findEquipeByNomEquipe (String nomEquipe);
    Equipe findEquipeById (Long id);

}

package com.example.maryembaldiexamen.DAO.Repositories;

import com.example.maryembaldiexamen.DAO.Entities.Equipe;
import com.example.maryembaldiexamen.DAO.Entities.Rencontre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RencontreRepository extends JpaRepository<Rencontre,Long> {


    Rencontre findRencontreById (Long id);
}

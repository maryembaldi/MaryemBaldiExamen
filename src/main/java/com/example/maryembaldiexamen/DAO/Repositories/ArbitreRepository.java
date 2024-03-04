package com.example.maryembaldiexamen.DAO.Repositories;

import com.example.maryembaldiexamen.DAO.Entities.Arbitre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbitreRepository extends JpaRepository<Arbitre,Long>{
    Arbitre findArbitreById (long id);
}


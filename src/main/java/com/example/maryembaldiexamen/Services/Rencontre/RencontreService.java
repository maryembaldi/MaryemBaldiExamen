package com.example.maryembaldiexamen.Services.Rencontre;

import com.example.maryembaldiexamen.DAO.Entities.Equipe;
import com.example.maryembaldiexamen.DAO.Entities.Rencontre;
import com.example.maryembaldiexamen.DAO.Repositories.EquipeRepository;
import com.example.maryembaldiexamen.DAO.Repositories.RencontreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class RencontreService implements IRencontre{

    RencontreRepository rencontreRepository;
    EquipeRepository equipeRepository;

    @Override
    public Rencontre ajouterRencontreEtAffecterEquipes(Rencontre r, long idE1, long idE2) {
        Rencontre rencontre = rencontreRepository.save(r);
        Equipe equipe1 = equipeRepository.findEquipeById(idE1);
        Equipe equipe2 = equipeRepository.findEquipeById(idE2);
        equipe1.getRencontres().add(r);
        equipe2.getRencontres().add(r);
        rencontreRepository.save(r);
        return  r;
    }
}

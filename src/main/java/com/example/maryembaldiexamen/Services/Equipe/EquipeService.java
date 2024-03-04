package com.example.maryembaldiexamen.Services.Equipe;

import com.example.maryembaldiexamen.DAO.Entities.Equipe;
import com.example.maryembaldiexamen.DAO.Repositories.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EquipeService implements  IEquipe{
    EquipeRepository equipeRepository;
    @Override
    public Equipe ajouterEquipeEtJoueurs(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}

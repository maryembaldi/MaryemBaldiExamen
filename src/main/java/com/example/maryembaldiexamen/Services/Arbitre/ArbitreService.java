package com.example.maryembaldiexamen.Services.Arbitre;

import com.example.maryembaldiexamen.DAO.Entities.Arbitre;
import com.example.maryembaldiexamen.DAO.Repositories.ArbitreRepository;
import com.example.maryembaldiexamen.DAO.Repositories.RencontreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArbitreService implements  IArbitre {
    ArbitreRepository arbitreRepository;
    RencontreRepository rencontreRepository;

    @Override
    public Arbitre ajouterArbitre(Arbitre a) {
        return arbitreRepository.save(a);
    }

    @Override
    public void affecterArbitreARencontre(String nom, String prenom, int idR) {
//            Arbitre arbitre = arbitreRepository.findByNom(nom).orElseThrow();
//            Rencontre rencontre = rencontreRepository.findById(idR);
//

    }
}

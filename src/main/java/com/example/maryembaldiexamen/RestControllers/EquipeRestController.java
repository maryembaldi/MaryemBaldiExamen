package com.example.maryembaldiexamen.RestControllers;

import com.example.maryembaldiexamen.DAO.Entities.Equipe;
import com.example.maryembaldiexamen.Services.Equipe.IEquipe;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("equipe")
@AllArgsConstructor
public class EquipeRestController {
    IEquipe iEquipe;
    @PostMapping("ajouterEquipeEtJoueurs")
    Equipe ajouterEquipeEtJoueurs(@RequestBody Equipe e) {
        return iEquipe.ajouterEquipeEtJoueurs(e);
    }

}

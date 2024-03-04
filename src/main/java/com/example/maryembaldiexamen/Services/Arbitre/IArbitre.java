package com.example.maryembaldiexamen.Services.Arbitre;

import com.example.maryembaldiexamen.DAO.Entities.Arbitre;

public interface IArbitre {
    Arbitre ajouterArbitre (Arbitre arbitre);
    void affecterArbitreARencontre (String nom, String prenom, int idR) ;

}

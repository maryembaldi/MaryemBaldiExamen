package com.example.maryembaldiexamen.Services.Rencontre;

import com.example.maryembaldiexamen.DAO.Entities.Rencontre;

public interface IRencontre {
    Rencontre ajouterRencontreEtAffecterEquipes (Rencontre r, long idE1, long idE2);
}

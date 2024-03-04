package com.example.maryembaldiexamen.RestControllers;

import com.example.maryembaldiexamen.DAO.Entities.Rencontre;
import com.example.maryembaldiexamen.Services.Rencontre.IRencontre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rencontre")
@AllArgsConstructor
public class RencontreRestController {
    IRencontre iRencontre;

    @PostMapping("ajouterRencontreEtAffecterEquipes")
    Rencontre ajouterRencontreEtAffecterEquipes(@RequestBody Rencontre r, @RequestParam long idE1, long idE2) {
      return  iRencontre.ajouterRencontreEtAffecterEquipes(r,idE1,idE2);
    }


}

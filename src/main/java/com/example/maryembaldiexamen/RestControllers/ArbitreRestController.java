package com.example.maryembaldiexamen.RestControllers;

import com.example.maryembaldiexamen.DAO.Entities.Arbitre;
import com.example.maryembaldiexamen.Services.Arbitre.IArbitre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("arbitre")
@AllArgsConstructor
public class ArbitreRestController {
    IArbitre iArbitre;
    @PostMapping("ajouterArbitre")
    Arbitre ajouterArbitre(@RequestBody Arbitre a) {
        return iArbitre.ajouterArbitre(a);
    }
}

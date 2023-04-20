package model.Controllers;


import model.Caracteristique;
import model.DAO.DAO_Caracteristique;
import model.DAO.DAO_Espece;
import model.Espece;
import model.Poisson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/especes")
public class Controller_Espece
{
    public DAO_Espece  esp_dao;
    public DAO_Caracteristique cara_dao;
    public List<Caracteristique> caracteristiques = new ArrayList<Caracteristique>();
    public Controller_Espece(DAO_Espece esp_dao)
    {
        this.esp_dao = esp_dao;

        esp_dao.save(new Espece("Cétacé", "Regroupe les mamifères aquatiques"));
        esp_dao.save(new Espece("Requins", "Conqueriront le monde à l'aide de tornades"));
        esp_dao.save(new Espece("Cephalopode", "mollusques dont la tete est munie de tentacules"));
        esp_dao.save(new Espece("Crustacé", "corp revetu d'un exosquelette chitinoprotéique imprégné de carbonate de calcium"));



    }

    @PostMapping("/addSpecie/specie")
    public Espece CreateNewSpecies(@RequestBody Espece specie)
    {
        return specie;
    }

    @GetMapping
    public List<Espece> GetAllEspeces()
    {
        return this.esp_dao.findAll();
    }

}

package model.Controllers;
import model.DAO.DAO_Poisson;
import model.Espece;
import model.Poisson;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poissons")
public class Controller_Poisson
{
    public DAO_Poisson dao;

    public Controller_Poisson(DAO_Poisson dao)
    {
        this.dao = dao;

        dao.save(new Poisson("Orque", 1, 55, "L'orque a une répartition cosmopolite ; " +
                "elle vit dans les régions arctiques et antarctiques jusqu'aux mers tropicales. " +
                "Son régime alimentaire est très diversifié, bien que les populations se spécialisent " +
                "souvent dans des types particuliers de proies.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Killerwhales_jumping.jpg/1280px-Killerwhales_jumping.jpg" )
        );


    }


    @PostMapping("/{id}")
    public Poisson AssignSpecieToFish(@PathVariable int id, @RequestBody int specie)
    {
        Poisson poisson = dao.findById(id);
        poisson.setSpecie(specie);
        dao.save(poisson);
        return poisson;
    }
    @GetMapping("/all")
    public List<Poisson> GetAllPoissons()
    {
        return this.dao.findAll();
    }

}

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
        //id 1
        dao.save(new Poisson("Orque", 1, 55, "L'orque a une répartition cosmopolite ; elle vit dans les régions arctiques et antarctiques jusqu'aux mers tropicales. Son régime alimentaire est très diversifié, bien que les populations se spécialisent souvent dans des types particuliers de proies.","https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Killerwhales_jumping.jpg/1280px-Killerwhales_jumping.jpg" ));
        // id 2
        dao.save(new Poisson("Dauphin", 1, 46, "Sous le terme dauphin, on regroupe beaucoup d'espèces très différentes. Aussi bien au niveau comportemental qu'au niveau physique aussi les généralités propres à tous les dauphins sont communes à tous les odontocètes, appelés « dauphins » ou non.","https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Tursiops_truncatus_01.jpg/1280px-Tursiops_truncatus_01.jpg" ));
        // id 3
        dao.save(new Poisson("Narval", 1, 40, "Avec sa petite tête et son corps trapu le narval est un cétacé atypique qui se caractérise par une défense en spirale. Cette défense qui est en fait la dent gauche des mâles pousse après la naissance et peut mesurer jusqu'à 2,7 m et peser 10 kg.","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Pod_Monodon_monoceros.jpg/1280px-Pod_Monodon_monoceros.jpg" ));
        // id 4
        dao.save(new Poisson("Heterodontus", 2, 230, "Leur synapomorphie est d'avoir un dard empoisonné sur chacune de leurs deux nageoires dorsales, comme les requins fossiles d'il y a 150 millions d'années (mais aussi quelques espèces actuelles de l'ordre des squaliformes).","https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Horn_shark.JPG/1280px-Horn_shark.JPG" ));
        // id 5
        dao.save(new Poisson("Requin-baleine", 2, 120, "Le requin-baleine (Rhincodon typus) est une espèce de poissons cartilagineux, seul membre du genre Rhincodon et seule espèce actuelle de la famille des Rhincodontidae. Pouvant exceptionnellement atteindre 20 mètres de long, pour une masse de 34 tonnes, ce requin est considéré comme le plus grand poisson vivant actuellement sur Terre. Cependant, sa taille observable est en pratique généralement comprise entre 4 et 14 mètres.","https://upload.wikimedia.org/wikipedia/commons/8/88/Requin_baleine.JPG" ));
        // id 6
        dao.save(new Poisson("ange de mer du Pacifique", 2, 120, "L'ange de mer du Pacifique est un requin de petite taille avec une taille maximale de 1,50 mètre. L'ange de mer du Pacifique présente à première vue l'aspect d'une raie avec son corps aplati mais se distingue par la présence des nageoires pectorales larges et plates.",  "https://upload.wikimedia.org/wikipedia/commons/9/92/Squatina_californica.jpg" ) );
        // id 7
        dao.save(new Poisson("pieuvre", 3, 2, "Pieuvre(f) et poulpe(m) sont des noms vernaculaires ambigus désignant en français certains céphalopodes benthiques du sous-ordre Incirrina (principalement la famille des octopodidés, de l'ordre Octopoda). Ces animaux se caractérisent, au sein des céphalopodes par leur grande intelligence et par leur capacité à changer de couleur au millième de seconde, à leur guise, par mimétisme avec leur environnement ou en fonction de leurs émotions.", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Eledone_cirrhosa_Merculiano.jpg/1280px-Eledone_cirrhosa_Merculiano.jpg" ) );
        // id 8
        dao.save(new Poisson("kraken", 3, -1, "Dans ses rencontres avec l'homme, le kraken serait capable de saisir la coque d'un navire pour le faire chavirer, le faisant ainsi couler et ses marins sont noyés et parfois dévorés.", "https://upload.wikimedia.org/wikipedia/commons/9/9d/Colossal_octopus_by_Pierre_Denys_de_Montfort.jpg" ) );


    }


    @PostMapping("/{id}/{specie}")
    public Poisson AssignSpecieToFish(@PathVariable int id, @PathVariable int specie)
    {
        Poisson poisson = dao.findById(id);
        poisson.setSpecie(specie);
        dao.save(poisson);
        return poisson;
    }
    @GetMapping
    public List<Poisson> GetAllPoissons()
    {
        return this.dao.findAll();
    }

}

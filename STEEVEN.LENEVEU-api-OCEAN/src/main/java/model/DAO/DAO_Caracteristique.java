package model.DAO;

import model.Caracteristique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAO_Caracteristique extends JpaRepository<Caracteristique, Integer>
{
    public Caracteristique findById(int id);
}

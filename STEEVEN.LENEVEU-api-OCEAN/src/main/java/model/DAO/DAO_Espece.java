package model.DAO;

import model.Espece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAO_Espece extends JpaRepository<Espece, Integer>
{
    public Espece findById(int id);
}


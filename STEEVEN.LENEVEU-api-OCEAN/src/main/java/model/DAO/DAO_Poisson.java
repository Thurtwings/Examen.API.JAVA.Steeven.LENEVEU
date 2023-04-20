package model.DAO;

import model.Poisson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAO_Poisson extends JpaRepository<Poisson, Integer>
{
    public Poisson findById(int id);
}

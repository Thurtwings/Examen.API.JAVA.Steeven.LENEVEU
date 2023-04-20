package model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Espece
{
    private String name;

    @Id
    @GeneratedValue
    private int id;

    @Lob
    private String description;


    public Espece(String name, String description)
    {
        this.name = name;
        this.description = description;

    }

    public Espece() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}

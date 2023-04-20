package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Poisson
{
    @Id
    @GeneratedValue
    private int id;
    private String name;


    private int specie;
    private int lifespan;
    private String note;
    private String pictureLink;

    public Poisson(String name, int specie, int lifespan, String note, String pictureLink) {
        this.name = name;
        this.specie = specie;
        this.lifespan = lifespan;
        this.note = note;
        this.pictureLink = pictureLink;
    }

    public Poisson() {
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

    public int getSpecie() {
        return specie;
    }

    public void setSpecie(int specie) {
        this.specie = specie;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}

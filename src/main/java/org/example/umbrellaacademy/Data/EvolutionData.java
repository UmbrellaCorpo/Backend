package org.example.umbrellaacademy.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EvolutionData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Species;
    private double time;
    private String location;
    private String zone;
    private String currentCountry;
    private String habitat;
    private double cranialCapacity;
    private double height;
    private String incisorSize;
    private String jawShape;


    public EvolutionData(String genusSpecies, double time, String location, String zone, String currentCountry,
                         String habitat, double cranialCapacity, double height, String incisorSize, String jawShape) {
        this.Species = genusSpecies;
        this.time = time;
        this.location = location;
        this.zone = zone;
        this.currentCountry = currentCountry;
        this.habitat = habitat;
        this.cranialCapacity = cranialCapacity;
        this.height = height;
        this.incisorSize = incisorSize;
        this.jawShape = jawShape;
    }

    public EvolutionData() {

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getCranialCapacity() {
        return cranialCapacity;
    }

    public void setCranialCapacity(double cranialCapacity) {
        this.cranialCapacity = cranialCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getIncisorSize() {
        return incisorSize;
    }

    public void setIncisorSize(String incisorSize) {
        this.incisorSize = incisorSize;
    }

    public String getJawShape() {
        return jawShape;
    }

    public void setJawShape(String jawShape) {
        this.jawShape = jawShape;
    }
}

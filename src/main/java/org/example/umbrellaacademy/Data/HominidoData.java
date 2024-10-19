package org.example.umbrellaacademy.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HominidoData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int Species;
    private int time;
    private int location;
    private int zone;
    private int currentCountry;
    private int habitat;
    private double cranialCapacity;
    private double height;
    private int incisorSize;
    private int jawShape;

    public HominidoData(int genusSpecies, int time, int location, int zone, int currentCountry,
                         int habitat, double cranialCapacity, double height, int incisorSize, int jawShape) {
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

    public HominidoData() {

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSpecies() {
        return Species;
    }

    public void setSpecies(int Species) {
        this.Species = Species;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public int getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(int currentCountry) {
        this.currentCountry = currentCountry;
    }

    public int getHabitat() {
        return habitat;
    }

    public void setHabitat(int habitat) {
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

    public int getIncisorSize() {
        return incisorSize;
    }

    public void setIncisorSize(int incisorSize) {
        this.incisorSize = incisorSize;
    }

    public int getJawShape() {
        return jawShape;
    }

    public void setJawShape(int jawShape) {
        this.jawShape = jawShape;
    }
}


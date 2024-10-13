package State.Country;

import State.Region.Region;

import java.util.List;

public class Country {
    private String name;
    private int number;
    private int population;
    private String nationality;
    private List<Region> regions;

    public Country(String name, int number, int population, String nationality) {
        this.name = name;
        this.number = number;
        this.population = population;
        this.nationality = nationality;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}

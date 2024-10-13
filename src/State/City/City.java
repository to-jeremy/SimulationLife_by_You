package State.City;

import State.District.District;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private int number;
    private int population;
    private List<District> districts;

    public City(String name, int number, int population) {
        this.name = name;
        this.number = number;
        this.population = population;
        this.districts = new ArrayList<>();
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

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}

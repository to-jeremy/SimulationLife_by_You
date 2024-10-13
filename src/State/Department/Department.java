package State.Department;

import State.City.City;

import java.util.List;

public class Department {
    private String name;
    private int number;
    private int population;
    private List<City> cities;

    public Department(String name, int number, int population) {
        this.name = name;
        this.number = number;
        this.population = population;
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

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}

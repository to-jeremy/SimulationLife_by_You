package State.Region;

import State.Department.Department;

import java.util.List;

public class Region {
    private String name;
    private int number;
    private int population;
    private List<Department> departments;

    public Region(String name, int number, int population) {
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}

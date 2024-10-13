package State.District;

public class District {
    private String name;
    private int number;
    private int population;

    public District(String name, int number, int population) {
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
}

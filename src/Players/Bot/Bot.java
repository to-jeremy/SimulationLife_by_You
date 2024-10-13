package Players.Bot;

import Players.Person.Person;

public class Bot extends Person {
    private String botID;
    private String AIType;

    public Bot(String firstName, String lastName, String gender, int age, String birthDate, String botID, String AIType) {
        super(firstName, lastName, gender, age, birthDate);
        this.botID = botID;
        this.AIType = AIType;
    }

    // Getters and Setters

    public String getBotID() {
        return botID;
    }

    public void setBotID(String botID) {
        this.botID = botID;
    }

    public String getAIType() {
        return AIType;
    }

    public void setAIType(String AIType) {
        this.AIType = AIType;
    }
}

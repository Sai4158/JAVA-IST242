package Model;

/**
 * Filename: Model.java
 * Short description: Represents the data model in MVC pattern.
 * IST 242 Assignment: L03B
 * @version 3/15/2024
 */

public class Model {
    private FootballPlayerData fpData;

    public Model() {
        // Assuming FootballPlayerData has a no-argument constructor that initializes its members.
        fpData = new FootballPlayerData();
    }

    public FootballPlayerData getFpData() {
        return fpData;
    }

    public void setFpData(FootballPlayerData fpData) {
        this.fpData = fpData;
    }
}

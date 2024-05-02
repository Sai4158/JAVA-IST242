package Model;
/**
 * Filename: Model.java
 * Short description: Represents the application's data
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

public class Model {
    private FootballPlayerData fpData;
    //Constructor
    public Model() {
        // Initialize
        this.fpData = new FootballPlayerData();
    }

    // get and set methods
    public FootballPlayerData getFpData() {
        return fpData;
    }

    public void setFpData(FootballPlayerData fpData) {
        this.fpData = fpData;
    }

}

package Model;

/**
 * Filename: Model.java
 * Short description: Represents the data model in MVC pattern
 * IST 242 Assignment: L03B
 * @version 3/15/2024
 */

//methods

public class Model
{

    private FootballPlayerData fpData;

    public Model()
    {
        fpData = new FootballPlayerData();
    }

    public FootballPlayerData getFpData()
    {
        return fpData;
    }


    public void setFpData(FootballPlayerData fpd)
    {
        this.fpData = fpd;
    }
}

package Model;

import java.util.ArrayList;

public class GenEdData
{

    private ArrayList<GenEd> genEds;

    public GenEdData()
    {
        genEds = new ArrayList<>();
    }

    public void CreateGenEds()
    {
        GenEd ge1 = new GenEd("Writing/Speaking", "GWS");
        GenEd ge2 = new GenEd("Quantification", "GQ");
        GenEd ge3 = new GenEd("Arts", "GA");
        GenEd ge4 = new GenEd("Humanities", "GH");
        GenEd ge5 = new GenEd("Health and Wellness", "GHW");
        GenEd ge6 = new GenEd("Natural Sciences", "GN");
        GenEd ge7 = new GenEd("Social and Behavioral Sciences", "GS");
        GenEd ge8 = new GenEd("United States Cultures", "US");
        GenEd ge9 = new GenEd("International Cultures", "IL");
        genEds.add(ge1);
        genEds.add(ge2);
        genEds.add(ge3);
        genEds.add(ge4);
        genEds.add(ge5);
        genEds.add(ge6);
        genEds.add(ge7);
        genEds.add(ge8);
        genEds.add(ge9);
    }

}

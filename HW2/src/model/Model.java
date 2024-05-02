package model;
/*
 * Filename: Model.java
 * Short description: Handles the creation and management persons data
 * IST 242 Assignment: L01B
 * @author  Sai Rangineeni
 * @version 2/9/2024 (updated)
 */



public class Model {
    // Instance Variables -- define your private data
    private Person p1, p2, p3, p4, p5;

    public Model() {
        loadData();
    }

    private void loadData() {
        // Initialize Person objects with the given data
        p1 = new Person ("Marcus Allen", 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");
        p2 = new Person ("Kyle Alston", 180, "Robbinsville, N.J.", "Robbinsville");
        p3 = new Person ("Troy Apke", 220, "Mt. Lebanon, Pa.", "Mount Lebanon");
        p4 = new Person ("Matthew Baney", 225, "State College, Pa.", "State College");
        p5 = new Person ();
    }


    // Getters

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public Person getP3() {
        return p3;
    }

    public Person getP4() {
        return p4;
    }

    public Person getP5() {
        return p5;
    }

}

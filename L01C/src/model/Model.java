package model;/*
 * Filename: Model.java
 * Short description: Handles the creation and management of person data.
 * IST 242 Assignment: L01C
 * @author  Sai Rangineeni
 * @version 2/10/2024
 */

public class Model {
    // Instance Variables -- define your private data
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;

    // Constructors
    public Model() {
        loadData();
    }

    // pass in data to initialize variables
    public void loadData() {
        p1 = new Person("Marcus Allen", new Height(5, 2), 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");
        p2 = new Person("Kyle Alston", new Height(5, 9), 180, "Robbinsville, N.J.", "Robbinsville");
        p3 = new Person("Troy Apke", new Height(6, 1), 220, "Mt. Lebanon, Pa.", "Mount Lebanon");
        p4 = new Person("Matthew Baney", new Height(6, 0), 225, "State College, Pa.", "State College");
        // Default constructor
        p5 = new Person();
    }

    // get methods


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
    //Additional methods
    public String getData(int n) {
        switch (n) {
            case 1: return p1.toString();
            case 2: return p2.toString();
            case 3: return p3.toString();
            case 4: return p4.toString();
            case 5: return p5.toString();
            default: return "invalid input parameter";
        }
    }

}

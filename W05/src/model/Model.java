package model;/*
 * Filename: Model.java
 * Short description: Manages the data for the application.
 * IST 242 Assignment: W05: L01D
 * @author  Sai Rangineeni
 * @version 2/15/2024
 */

import java.util.ArrayList;

public class Model {
    // Instance Variables -- define your private data
    private ArrayList<Person> persons;

    // Constructors
    public Model() {
        // initialize default values
        persons = new ArrayList<>();
        loadData();
    }

    private void loadData() {
        // for 4 Person objects
        persons.add(new Person("Marcus Allen", new Height(5, 2), 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr."));
        persons.add(new Person("Kyle Alston", new Height(5, 9), 180, "Robbinsville, N.J.", "Robbinsville"));
        persons.add(new Person("Troy Apke", new Height(6, 1), 220, "Mt. Lebanon, Pa.", "Mount Lebanon"));
        persons.add(new Person("Matthew Baney", new Height(6, 0), 225, "State College, Pa.", "State College"));

        persons.add(new Person());
    }

    // Set methods - one set method for each instance variable defined above
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    // Getters
    public ArrayList<Person> getPersons() {
        return new ArrayList<>(persons); // Return a copy of the list to avoid external modification
    }

    // Data retrieval methods
    public ArrayList<String> getData() {
        ArrayList<String> dataStrings = new ArrayList<>();
        for (Person person : persons) {
            dataStrings.add(person.toString());
        }
        return dataStrings;
    }
}
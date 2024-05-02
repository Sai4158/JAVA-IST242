/*
 * Filename: ${Sai Rangineeni}.java
 * Short description:
 * IST 242 Assignment:
 * @author  YOUR NAME HERE
 * @version ${DATE}
 */


/**
 * @author ${USER}
 * @version 1.0 ${DATE}
 */
    public class Student {
// Instance Variables -- define your private data
    private int id;
    private String firstname;
    private String lastname;
    private double courseAverage;
    private String courseGrade;

    // Constructors
    public Student ()
        {
        // initialize default values
            id = 0;
            firstname = "unknow";
            lastname = "unknow";
            courseAverage = 0;
        }

    /**
     * Construtor which initializes all fields to parameter values supplied
     * @param i id, int
     * @param fn firstName, String
     * @param ln    lastName, String
     * @param avg   courseAverage, double
     * @param gr
     */
    public Student (int i, String fn, String ln, double avg, String gr) // pass in data to initialize variables
        {
            id = i;
            firstname = fn;
            lastname = ln;
            courseAverage = avg;
            courseGrade = "?";


        }

// Set methods - one set method for each instance variable defined above
//             - purpose is to pass in a value stored in the private variable
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname (String lastname){
        this.lastname = lastname;
    }
    public void setCourseAverage (double courseAverage){
        this.courseAverage = courseAverage;
    }
    public void setCourseGrade(String courseGrade){
        this.courseGrade = courseGrade;
    }

// Get methods - one get method for each instance variable defined above
    public int getId() {
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public double getCourseAverage(){
        return courseAverage;
    }
    public String getCourseGrade(){
        return courseGrade;
    }

//             - purpose is to return the value stored in the private variable

// Additional methods -- such as for calculation, display

public String toString()
        {
        // return data as a String
        return "Student{id=" + id +
        ", firstName=" + firstname +
                ", lastName=" + lastname +
                ", courseAverage=" + courseAverage +
                ", courseGrade=" + courseGrade + "}";
        }

        }

package Model;
/*
 * Filename: Model.java
 * Short description: The data and business of the MVC application
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */
import java.util.ArrayList;

public class Model
{

    private final ArrayList<Student> sts = new ArrayList<>();

    //initialize Model with data
    public Model() {
        // Create sample students
        MailAddress addr1 = new MailAddress("107 W College Avenue", "State College", "PA", 16801);
        Student st1 = new Student("Emily", "Smith", 20, addr1);
        MailAddress addr2 = new MailAddress("200 W College Avenue", "State College", "PA", 16801);
        Student st2 = new Student("Mary", "Doe", 20, addr2);
        MailAddress addr3 = new MailAddress("300 W College Avenue", "State College", "PA", 16801);
        Student st3 = new Student("John", "Doe", 20, addr3);
        // Add students to the list
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
    }


    // Method to update student credits
    public String updateStudentCredits(int index) {
        Student student = sts.get(index);
        student.creditsThisSemester();

        // Return updated info
        return student.getInfo();
    }
}
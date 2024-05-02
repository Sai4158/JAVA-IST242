package Model;
/*
 * Filename: Student.java
 * Short description: with personal and academic details
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */
public class Student
{
    //---------Declaring attributes----

    String firstName;
    String lastName;
    int age;
    MailAddress address;
    int credits;

    //------------------------------
    //----------Constructor------------

    public Student(String firstName, String lastName, int age, MailAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.credits = creditsThisSemester();
    }

    //---------- METHODS --------
    public String getInfo()
    {
        return "NAME = " + firstName + "  " + lastName + "  " + "Age = " + age + ", address=" + address.toString() + " credits=" + credits;
    }

    //------------------------------------------------
    public int creditsThisSemester()
    {
        //calculate randomly a new value for credits in the semester
        double dn = Math.random();
        credits = (int) (15.0 * dn);
        return credits;
    }
}

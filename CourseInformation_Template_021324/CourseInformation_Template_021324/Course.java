/*
 * Filename: Course.java
 * Short description: Defines attributes and methods for generic courses.
 * IST 242 Assignment: W06_Class Replacement
 * @author  Sai Rangineeni
 * @version 2/13/2024
 */
public class Course {
    // TODO: Declare private fields - courseNumber, courseTitle
    private String courseNumber;
    private String courseTitle;

    // TODO: Define constructors
    public Course() {
        // Initialize default values
        this.courseNumber = "N/A";
        this.courseTitle = "N/A";
    }

    public Course(String courseNumber, String courseTitle) {
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
    }

    // TODO: Define mutator methods -
    //       setCourseNumber(), setCourseTitle()

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    // TODO: Define accessor methods -
    //       getCourseNumber(), getCourseTitle()

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    // TODO: Define printInfo()
    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + getCourseNumber());
        System.out.println("   Course Title: " + getCourseTitle());

    }


    // TODO: Define toString()

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber='" + courseNumber + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                '}';
    }
}

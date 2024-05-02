/*
 * Filename: OfferedCourse.java
 * Short description: adding details specific to offered instances like instructor, term, and class time.
 * IST 242 Assignment: W06_Class Replacement
 * @author  Sai Rangineeni
 * @version 2/13/2024
 */
public class OfferedCourse extends Course {
   // TODO: Declare private fields - instructorName, term, classTime
    private String instructorName;
    private String term;
    private String classTime;

   // TODO: Define constructors
   public OfferedCourse() {
       super("", "");
       instructorName = "";
       term = "";
       classTime = "";
   }

    public OfferedCourse(String courseNumber, String courseTitle, String instructorName, String term, String classTime) {
        super(courseNumber, courseTitle); // Calls Course constructor
        this.instructorName = instructorName;
        this.term = term;
        this.classTime = classTime;
    }

   // TODO: Define mutator methods -
   //      setInstructorName(), setTerm(), setClassTime()

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }


    // TODO: Define accessor methods -
   //      getInstructorName(), getTerm(), getClassTime()

    public String getInstructorName() {
        return instructorName;
    }

    public String getTerm() {
        return term;
    }

    public String getClassTime() {
        return classTime;
    }

    // Print offered course
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Instructor Name: " + instructorName);
        System.out.println("   Term: " + term);
        System.out.println("   Class Time: " + classTime);
    }


    // TODO: Define toString()

    @Override
    public String toString() {
        return "OfferedCourse{" +
                "instructorName='" + instructorName + '\'' +
                ", term='" + term + '\'' +
                ", classTime='" + classTime + '\'' +
                '}';
    }
}
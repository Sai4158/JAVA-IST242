/*
 * Filename: CourseInformation.java
 * Short description: Main class for input and display of course information
 * IST 242 Assignment: W06_Class Replacement
 * @author  Sai Rangineeni
 * @version 2/13/2024
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CourseInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Initialize the Course and OfferedCourse objects
      System.out.println("Enter basic course details.");
      System.out.print("Course Number: ");
      String courseNumber = scnr.nextLine();
      System.out.print("Course Title: ");
      String courseTitle = scnr.nextLine();
      Course basicCourse = new Course(courseNumber, courseTitle);

      System.out.println("\nNow enter offered course details.");
      System.out.print("Offered Course Number: ");
      String offeredCourseNumber = scnr.nextLine();
      System.out.print("Offered Course Title: ");
      String offeredCourseTitle = scnr.nextLine();
      System.out.print("Instructor Name: ");
      String instructorName = scnr.nextLine();
      System.out.print("Term: ");
      String term = scnr.nextLine();
      System.out.print("Class Time: ");
      String classTime = scnr.nextLine();
      OfferedCourse offeredCourse = new OfferedCourse(offeredCourseNumber, offeredCourseTitle, instructorName, term, classTime);

      // Create an ArrayList for Course objects
      ArrayList<Course> coursesList = new ArrayList<>();
      coursesList.add(basicCourse);
      coursesList.add(offeredCourse);

      // Displaying course information
      for (Course course : coursesList) {
         System.out.println("\nCourse Information:");
         System.out.println("   Course Number: " + course.getCourseNumber());
         System.out.println("   Course Title: " + course.getCourseTitle());
         if (course instanceof OfferedCourse) {
            OfferedCourse oc = (OfferedCourse) course;
            System.out.println("   Instructor Name: " + oc.getInstructorName());
            System.out.println("   Term: " + oc.getTerm());
            System.out.println("   Class Time: " + oc.getClassTime());
         }
      }

      scnr.close();
   }
}


/* Sample Input:
ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Fall 2018
WF: 2-3:30 pm
*/

/* Sample Output:
Course Information:
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information:
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Term: Fall 2018
   Class Time: WF: 2-3:30 pm
*/
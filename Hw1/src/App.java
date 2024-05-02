/*
 * Filename: App.java
 * Short description:  Uses the Person class to create and display person objects.
 * IST 242 Assignment: M02 - W02: L01A Assignment - Objects and Classes
 * @author  Sai Rangineeni
 * @version 1/28/2024
 */


public class App {
    public static void main(String[] args){
    //creating objects
    Person st1 = new Person("Marcus Allen", 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");
    Person st2 = new Person("Kyle Alston", 180, "Robbinsville, N.J.", "Robbinsville");
    Person st3 = new Person("Troy Apke", 220, "Mt. Lebanon, Pa.", "Mount Lebanon");
    Person st4 = new Person("Matthew Baney", 225, "State College, Pa.", "State College");
    Person st5 = new Person();

        //print them out
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);

    }

}

/*
Person{name=Marcus Allen, weight=200, hometown=Upper Marlboro, Md., highSchool=Dr. Henry A. Wise, Jr.}
Person{name=Kyle Alston, weight=180, hometown=Robbinsville, N.J., highSchool=Robbinsville}
Person{name=Troy Apke, weight=220, hometown=Mt. Lebanon, Pa., highSchool=Mount Lebanon}
Person{name=Matthew Baney, weight=225, hometown=State College, Pa., highSchool=State College}
Person{name=, weight=0, hometown=N/A, highSchool=N/A}

Process finished with exit code 0
 */
/*
 * Filename: App.java
 * Short description: class to the student class
 * IST 242 Assignment: Ist 242 assinment
 * @author  Sai Rangineeni
 * @version 1/25/2024
 */


/**
 * @author saira
 * @version 1.0 1/25/2024
 */
public class App {
    public static void main(String[] args){
    //program desc
        System.out.println("This will prgram will prin test data sotrage in our student ");
        //declare and crate 3 student objecgts
                Student st1 = new Student(1001, " jony", "Smith",95,"a" );
                Student st2 = new Student(1002, " ken", "hir",55,"d" );
                Student st3 = new Student(1003, " amcy", "hewq",75,"c" );
                Student st4 = new Student(1004, " hel", "jel",85,"b" );

        //display the student info
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
    }
}



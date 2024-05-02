/***************************************
* Filename: App.java
* Short description: This class ...
* @author Nannette D'Imperio
* @version  1/22/2019
***************************************/

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author nxd13
 */
public class App {

    public static void main(String[] args) {
        Person p1 = new Person("Zack", "Mills", 22);
        System.out.println(p1.getInfo());

        Student st1 = new Student("Zack", "Mills", 22, "IST");
        System.out.println(st1.getAllInfo());

        FootballPlayer fp1 = new FootballPlayer("Zack", "Mills", 22, "IST",
                5.9f, 240, "Junior", "Running Back");
        System.out.println(fp1.getAllInfo());

        QuarterBack qb1 = new QuarterBack("Zack", "Mills", 22, "IST",
                5.9f, 240, "Junior", "Running Back", 30, 50);
        System.out.println(qb1.getAllInfo());

        //
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(st1);
        persons.add(fp1);
        persons.add(qb1);

        for (Person p : persons) {
            System.out.println(p.getInfo());

        }
    }
}



import java.util.ArrayList;

public class app
{
    public static void main(String args[])
    {
        student st1 = new student("Chris", "Campbell", 20);
        student st2 = new student("Marcus", "Allen", 21);
        student st3 = new student("Tommy", "Stevens", 19);

        ArrayList <student> studentArray = new ArrayList();

        studentArray.add(st1);
        studentArray.add(st2);
        studentArray.add(st3);

        for (int i = 0; i < studentArray.size(); i++)
        {
            System.out.println(studentArray.get(i).firstName);
        }
        
        System.out.println(studentArray.get(2).firstName +" is "+ studentArray.get(2).age + " years old");

    }
}

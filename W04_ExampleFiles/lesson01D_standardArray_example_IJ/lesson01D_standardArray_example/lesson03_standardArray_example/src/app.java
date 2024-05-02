public class app
{
    public static void main(String args[ ])
    {
        student st1 = new student("Chris", "Campbell", 20);
        student st2 = new student("Marcus", "Allen", 21);
        student st3 = new student("Tommy", "Stevens", 19);

        student[ ] studentArray = new student[3];

        studentArray[0] = st1;
        studentArray[1] = st2;
        studentArray[2] = st3;

        for (int i = 0; i < studentArray.length; i++)
        {
            System.out.println(studentArray[i].firstName);
        }
        
        System.out.println(studentArray[2].firstName +" is "+ studentArray[2].age + " years old");

    }
}

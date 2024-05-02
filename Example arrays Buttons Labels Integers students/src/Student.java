
class Student
{
    //class variables

    String firstName;
    String lastName;
    int age;

    Student(String informedFirstName, String informedLastName, int informedAge)
    {
        firstName = informedFirstName;
        lastName = informedLastName;
        age = informedAge;
    }

    String getName()
    {
        return firstName + " " + lastName;

    }
}


class student
{
    //class variables

    String firstName;
    String lastName;
    int age;

    //student method
    student(String informedFirstName, String informedLastName, int informedAge)
    {
        firstName = informedFirstName;
        lastName = informedLastName;
        age = informedAge;
    }

    //return values
    String getName()
    {
        return firstName + " " + lastName;

    }

    String whatsUp()
    {
        //calculation//intelligence
        //0/1/2/3/4 =" "doing a lab" "reading a book" ....
        String answer = "I don't know";
        return answer;
    }
}

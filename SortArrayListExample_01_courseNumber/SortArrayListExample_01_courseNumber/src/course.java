
public class course implements Comparable<course>
{
    //instance variable
    int number;
    String name;

    course(int a, String b)
    {
        number = a;
        name = b;
    }

    public String toString()
    {
        return number + "-" + name;
    }

    @Override
    public int compareTo(course course2)
    {
        if (number < (course2.number))
        {
            return -1;
        }
        if (number == (course2.number))
        {
            return 0;
        }
        return 1;
    }
}

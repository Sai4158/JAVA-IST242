package Model;

public class Employee
{

    private String name;  //Attributes/Variables/class variables/instance variables
    private int id;
    private String department;

    //Control i on a Mac
    //Alt insert on a Windows machine
    public Employee(String name, int id, String department) // constructor initializes all attributes
    {
        //this means this very class as an object
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public Employee() // constructor initializes all attributes
    {
        //this means this very class as an object
        this.name = "John Doe";
        this.id = 0;
        this.department = "None";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)  //receives an input parameter to update the attribute
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    @Override  //inheritance later
    public String toString()
    {
        return "Employee{" + "name=" + name + ", id=" + id + ", department=" + department + '}';
    }

}

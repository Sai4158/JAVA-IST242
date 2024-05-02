package Model;

public class Employee
{

    String name;  //Attributes/Variables/class variables/instance variables
    int id;
    String department;
    Address address; //Classes are types, just like int or boolean or String
    // Address is a Type

    public Employee(String name, int id, String department, Address address)
    {
        this.name = name;
        this.id = id;
        this.department = department;
        this.address = address;
    }

    public Employee()
    {
        this.name = "";
        this.id = 0;
        this.department = "";
        this.address = new Address();// very important, see also line 26 in Model.java
    }

    @Override
    public String toString()
    {
        return "Employee{" + "name=" + name + ", id=" + id + ", department=" + department + ", address=" + address.toString() + '"';
    }

}

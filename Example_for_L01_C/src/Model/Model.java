package Model;

public class Model
{

    private Employee ep1;
    private Employee ep2;
    private Employee ep3;

    public Model()
    {

        loadData();
    }

    public void loadData()
    {
        //public Address(int number, String name, String state, int zipcode)
        Address ad1 = new Address(100, "Main Street", "PA", 16802);

        //public Employee(String name, int id, String department, Address address)
        ep1 = new Employee("Fred Fonz", 111222, "Sales", ad1);  //the new opeartor calls the CONSTRUCTOR

        ep2 = new Employee("Alex Fonz", 111222, "IT", new Address(310, "West College ave", "PA", 16801));  //the new opeartor calls the CONSTRUCTOR

        ep3 = new Employee();
//
    }
//getData(int n)  method

    public Employee getEp1()
    {
        return ep1;
    }

    public void setEp1(Employee ep1)
    {
        this.ep1 = ep1;
    }

    public Employee getEp2()
    {
        return ep2;
    }

    public void setEp2(Employee ep2)
    {
        this.ep2 = ep2;
    }

    public Employee getEp3()
    {
        return ep3;
    }

    public void setEp3(Employee ep3)
    {
        this.ep3 = ep3;
    }

}

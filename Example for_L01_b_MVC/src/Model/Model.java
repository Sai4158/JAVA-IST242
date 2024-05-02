package Model;

public class Model
{

    private Employee ep1;
    private Employee ep2;

    public Model()
    {

        loadData();
    }

    public void loadData()
    {
        ep1 = new Employee("Fred Fonz", 111222, "Sales");  //the new opeartor calls the CONSTRUCTOR

        ep1.setName("Fred Gomez");
        //  ep1.department = "Sales";
        //  ep1.id = 1111222;

        ep2 = new Employee();

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

}

package Model;

import java.util.ArrayList;

public class Model
{
    private ArrayList<Employee> eps;

    public Model()
    {
        eps = new ArrayList<Employee>();
      //eps = new ArrayList<>(); from Java 8 on, you don't need to REPEAT "Employee"
        loadData();
    }

    public void loadData()
    {
        Employee ep1;
        Employee ep2;
        Employee ep3;
        //public Address(int number, String name, String state, int zipcode)
        Address ad1 = new Address(100, "Main Street", "PA", 16802);

        //public Employee(String name, int id, String department, Address address)
        ep1 = new Employee("Fred Fonz", 111222, "Sales", ad1);  //the new opeartor calls the CONSTRUCTOR

        ep2 = new Employee("Alex Fonz", 111222, "IT", new Address(310, "West College ave", "PA", 16801));  //the new opeartor calls the CONSTRUCTOR

        ep3 = new Employee("Alex Fonz", 111222, "IT", 310, "West College ave", "PA", 16801);
        
        eps.add(ep1);
        eps.add(ep2);
        eps.add(ep3);
//
    }
//getData(int n)  method
//getData()
//for loop
//return ArrayList<String>    

    public ArrayList<Employee> getEps()
    {
        return eps;
    }

    public void setEps(ArrayList<Employee> eps)
    {
        this.eps = eps;
    }



}

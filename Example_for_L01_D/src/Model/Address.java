/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Address
{

    private int number;
    private String name;
    private String state;
    private int zipcode;

    public Address(int number, String name, String state, int zipcode)
    {
        this.number = number;
        this.name = name;
        this.state = state;
        this.zipcode = zipcode;
    }
    public Address()
    {
        this.number = 0;
        this.name = "";
        this.state = "";
        this.zipcode = 0;
    }

    @Override
    public String toString()
    {
        return "Address{" + "number=" + "'"+ number + '"'+ ", name=" + name + ", state=" + state + ", zipcode=" + zipcode + '}';
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(int zipcode)
    {
        this.zipcode = zipcode;
    }

}
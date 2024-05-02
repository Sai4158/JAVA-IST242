package Model;
/*
 * Filename: MailAddress.java
 * Short description: Info with street, city, state, and zipcode
 * IST 242 Assignment: W09: L04A
 * @author Sai Rangineeni
 * @version 3/22/2024
 */
public class MailAddress
{
    //variables
    String streetAddress;
    String city;
    String state;
    int zipcode;

    public MailAddress(String streetAddress, String city, String state, int zipcode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString()
    {
        return streetAddress + "," + city + "," + state + "," + zipcode;
    }

}

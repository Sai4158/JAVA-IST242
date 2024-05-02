
public class app 
{
    public static void main(String[] args) 
	{
            quarterBack qb1 = new quarterBack("Zack","Mills",20, "IST", 5.9f, 240, "Junior","Quarter Back", 15, 27);
            runningBack rb1 = new runningBack("Larry","Johnson",22, "IST", 5.9f, 240, "sophomore","Running Back", 340,10,2);
            
            displayRatings(qb1);
            displayRatings(rb1);
	}
    static void displayRatings(footballPlayer fp)
    {
        double rate = fp.rating();
        System.out.println(fp.getFirstName() + " is a " + fp.getPosition() +" and has a rating of " + fp.rating());
    }
}

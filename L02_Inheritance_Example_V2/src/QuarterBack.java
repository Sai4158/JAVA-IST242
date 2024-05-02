/***************************************
* Filename: QuarterBack.java
* Short description: This class ...
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

/**
 *
 * @author nxd13
 */
public class QuarterBack extends FootballPlayer{
    // attributes
    private int completions;
    private int attempts;
    
    // Constructor
    QuarterBack(String fn, String ln, int ag, String mj, float ht,
            float wt, String exp, String pos, int cp, int att)
    {
        super(fn, ln, ag, mj, ht, wt, exp, pos);
        completions = cp;
        attempts = att;
    }
    
    // Setters and getters

    public int getCompletions() {
        return completions;
    }

    public void setCompletions(int completions) {
        this.completions = completions;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    @Override
    String getAllInfo() {
        return super.getAllInfo() + " " + getCompletions() + " " 
                + attempts; //To change body of generated methods, choose Tools | Templates.
    }
    

}

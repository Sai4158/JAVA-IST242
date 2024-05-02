
public class quarterBack extends footballPlayer
{
    private int completions;
    private int attempts;

    quarterBack(String fn, String ln, int ag, String mj, float ht, float wt, String exp, String pos, int cp, int att)
    {

        super(fn, ln, ag, mj, ht, wt, exp, pos);

        completions = cp;
        attempts = att;
    }
    public float rating()
    {
        System.out.println(footballPlayer);
        float qbRating = (float)completions/attempts;
        return qbRating;
    }
    
    /**
     * @return the completions
     */
    public int getCompletions() {
        return completions;
    }
    /**
     * @param completions the completions to set
     */
    public void setCompletions(int completions) {
        this.completions = completions;
    }
    /**
     * @return the attempts
     */
    public int getAttempts() {
        return attempts;
    }
    /**
     * @param attempts the attempts to set
     */
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
}


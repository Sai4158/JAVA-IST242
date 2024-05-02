
public class runningBack extends footballPlayer
{
    private int yards;
    private int touchdowns;
    private int fumbles;

    runningBack(String fn, String ln, int ag, String mj, float ht, float wt, String exp, String pos, int yd, int td, int fb)
    {
        super(fn, ln, ag, mj, ht, wt, exp, pos);
        yards = yd;
        touchdowns = td;
        fumbles = fb;
    }
    public float rating()
    {
        System.out.println(footballPlayer);
        float rbRating = (touchdowns*yards)/fumbles;
        return rbRating;
    }

    /**
     * @return the yards
     */
    public int getYards() {
        return yards;
    }

    /**
     * @param yards the yards to set
     */
    public void setYards(int yards) {
        this.yards = yards;
    }

    /**
     * @return the touchdowns
     */
    public int getTouchdowns() {
        return touchdowns;
    }

    /**
     * @param touchdowns the touchdowns to set
     */
    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    /**
     * @return the fumbles
     */
    public int getFumbles() {
        return fumbles;
    }

    /**
     * @param fumbles the fumbles to set
     */
    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

}


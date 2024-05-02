package Model;

import java.util.ArrayList;

public class Course
{
    //instance varibles
    private CourseName name;
    private ArrayList<GenEd> genEds;
    private String description;
    private Integer credits;
    private String preReqs;
    private String comments;

    public Course()
    {

    }

    public Course(String a, String b, String c, String d, int e, String f, String g)
    {
        name = new CourseName(a, b, c);
        genEds = new ArrayList<>();
        description = d;
        credits = e;
        preReqs = f;
        comments = g;
    }

    public Course(String a, String b, String c)
    {
        name = new CourseName(a, b, c);
        genEds = new ArrayList<>();
        description = "";
        credits = 0;
        preReqs = "";
        comments = "";
    }

    /**
     * @return the name
     */
    public CourseName getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(CourseName name)
    {
        this.name = name;
    }

    /**
     * @return the genEds
     */
    public ArrayList<GenEd> getGenEds()
    {
        return genEds;
    }

    /**
     * @param genEds the genEds to set
     */
    public void setGenEds(ArrayList<GenEd> genEds)
    {
        this.genEds = genEds;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the credits
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits)
    {
        this.credits = credits;
    }

    /**
     * @return the preReqs
     */
    public String getPreReqs()
    {
        return preReqs;
    }

    /**
     * @param preReqs the preReqs to set
     */
    public void setPreReqs(String preReqs)
    {
        this.preReqs = preReqs;
    }

    /**
     * @return the comments
     */
    public String getComments()
    {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments)
    {
        this.comments = comments;
    }

}

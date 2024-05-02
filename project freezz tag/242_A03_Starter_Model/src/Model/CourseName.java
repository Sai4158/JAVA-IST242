package Model;

public class CourseName
{
    //instance varibles

    private String major;
    private String number;
    private String complement;

    public CourseName()
    {
    }

    public CourseName(String a, String b, String c)
    {
        major = a;
        number = b;
        complement = c;
    }

    public String getCourseNameNoSpaces()
    {
        return getMajor().trim() + getNumber().trim() + getComplement().trim();
    }

    public String getCourseNameFormatted()
    {
        String s = getMajor() + " " + getNumber() + " " + getComplement();
        return s.trim();  //no trailing spaces
    }

    @Override
    public String toString()
    {
        return getMajor() + " " + getNumber() + " " + getComplement();
    }

    /**
     * @return the major
     */
    public String getMajor()
    {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major)
    {
        this.major = major;
    }

    /**
     * @return the number
     */
    public String getNumber()
    {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number)
    {
        this.number = number;
    }

    /**
     * @return the complement
     */
    public String getComplement()
    {
        return complement;
    }

    /**
     * @param complement the complement to set
     */
    public void setComplement(String complement)
    {
        this.complement = complement;
    }

}

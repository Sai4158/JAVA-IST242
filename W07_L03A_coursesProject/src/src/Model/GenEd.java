package src.Model;

public class GenEd
{
    //instance varibles
    private String code;
    private String description;

    public GenEd()
    {
    }

    public GenEd(String a, String b)
    {
        description = a;
        code = b;
    }

    public String getInfo()
    {
        return "genEd{" + "description=" + getDescription() + ", code=" + getCode() + "}";
    }

    @Override
    public String toString()
    {
        return getCode();
    }

    /**
     * @return the code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code)
    {
        this.code = code;
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

}

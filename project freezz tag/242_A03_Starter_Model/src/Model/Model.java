package Model;

public class Model
{

    public CourseData cd;
    public GenEdData gd;

    public Model()
    {
        cd = new CourseData();
        int[] cdSelectedFields = new int[0];
        cd.setSelectedFields(cdSelectedFields);
        System.out.println("Course Headers=" + cd.getHeaders());
        System.out.println("Course line 5=" + cd.getLine(5));
        System.out.println("Course range 3-5=" + cd.getLines(3, 5));
        System.out.println("===============================================================");
        cdSelectedFields = new int[3];
        cdSelectedFields[0] = 0;
        cdSelectedFields[1] = 2;
        cdSelectedFields[2] = 3;
        cd.setSelectedFields(cdSelectedFields);
        System.out.println("Course Headers=" + cd.getHeaders());
        System.out.println("Course line 5=" + cd.getLine(5));
        System.out.println("Course range 3-5=" + cd.getLines(3, 5));

        System.out.println("===============================================================");
        gd = new GenEdData();
        int[] gdSelectedFields = new int[0];
        gd.setSelectedFields(gdSelectedFields);
        System.out.println("Gen Ed Headers=" + gd.getHeaders());
        System.out.println("Gen Ed line 3=" + gd.getLine(3));
        System.out.println("Gen Ed range 0-3=" + gd.getLines(0, 3));
        System.out.println("===============================================================");
    }
}

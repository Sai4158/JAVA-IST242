package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class CourseData
{

    private ArrayList<Course> courses;

    public CourseData()
    {
        courses = new ArrayList<>();
    }

    public void ReadCoursesFromXML()
    {
        try
        {
            Course cs;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("CourseTable.xml")));
            cs = new Course();
            while (cs != null)
            {
                try
                {
                    cs = (Course) decoder.readObject();
                    courses.add(cs);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }

}

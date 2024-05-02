public class Student
{
	//---------Declaring attributes----
	    public String firstName;
        public String middleName;
	    public String lastName;
	    public int age;
        public String major;
        public String streetAddress;
        public String city;
        public String state;
        public int zipcode;
        public String initials;

	public Student(String inf_firstName, String inf_middleName, String inf_lastName,
                   int inf_age, String inf_major, String inf_streetAddress,
                   String inf_city, String inf_state, int inf_zipcode)
	{
		        firstName = inf_firstName;
                middleName = inf_middleName;
		        lastName = inf_lastName;
		        age = inf_age;
                major = inf_major;
                streetAddress = inf_streetAddress;
                city = inf_city;
                state = inf_state;
                zipcode = inf_zipcode;
                initials = getInitials();
	}
        public Student()
        {
           this("John","unknown","Doe",0,
                   "undetermined","unknown","unknown",
                   "unknown",0);
        }
	    public String getInfo()
	{
		return getName() +"  "+"Age = "+ age + ", address="+streetAddress+","+city+","+state+","+zipcode;
	}
        public String getName()
        {
            return firstName + " "  + lastName;
        }
        public String getInitials()
        {
            String firstInitial = firstName.substring(0,1);
            String middleInitial = middleName.substring(0,1);
            String lastInitial = lastName.substring(0,1);
            String result = firstInitial + "." + middleInitial + "." + lastInitial + ".";
            return result;
        }
        public void displayMajor()
        {
            System.out.println(firstName + "'s major is " + major);
        }
        public boolean isOlderThan(int informed_age)
        {
            boolean result;
            if(age > informed_age)
            {
                return true;
            }
            else return false;
        }   
        public boolean isOlderThan(Student another_student)
        {
            boolean result;
            if(age > another_student.age)
            {
                return true;
            }
            else return false;
        }   
}
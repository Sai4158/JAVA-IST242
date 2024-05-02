class App
{
	public static void main(String[] args)
	{
            Student st1 = new Student("Zack","Edward","Mills",20, "IST", "107 W College Avenue", "State College", "PA", 16801);
            System.out.println("student info = " + st1.getInfo());
            System.out.println("==============================================================");
            
            Student temp = new Student();
            System.out.println("temp info = " + temp.getInfo());
            System.out.println("==============================================================");
            
            Student st3 = new Student("Saquon","M.","Barkley",
                    21, "Philosophy", "330 IST Building",
                    "University Park", "PA", 16802);
            System.out.println("Student 3 info:" + st3.getInfo());
        System.out.println("==============================================================");
        if(st1.isOlderThan(st3))
            {
                System.out.println(st1.initials + "is older than " + st3.initials);
            }
            else
            {
                System.out.println(st3.initials + " is older than " + st1.initials);
            }
            System.out.println("==============================================================");
            if(st1.isOlderThan(st3.age))
            {
                System.out.println(st1.initials + "is older than " + st3.initials);
            }
            else
            {
                System.out.println(st3.initials + " is older than " + st1.initials);
            }
            System.out.println("==============================================================");
            
            String s = st1.firstName.substring(0,1);
            System.out.println("s="+s);
	}
}

/*
student info = Zack Mills  Age = 20, address=107 W College Avenue,State College,PA,16801
==============================================================
temp info = John Doe  Age = 0, address=unknown,unknown,unknown,0
==============================================================
Student 3 info:Saquon Barkley  Age = 21, address=330 IST Building,University Park,PA,16802
==============================================================
S.M.B. is older than Z.E.M.
==============================================================
S.M.B. is older than Z.E.M.
==============================================================
s=Z

 */
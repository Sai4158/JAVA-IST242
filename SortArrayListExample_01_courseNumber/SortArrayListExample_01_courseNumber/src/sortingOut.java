
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class sortingOut
{

    ArrayList<course> courseTable = new ArrayList<course>();

    sortingOut()
    {
        createCourses();
        Collections.shuffle(courseTable); //Shuffles the table just for the testing
        System.out.println("SHUFFLED");
        System.out.println(courseTable.toString());
        System.out.println("=====================================");
        //======================================================================//
        //This is the real sort statement
        //Sorts an ArrayList of course
        //The course class implements Comparable
        //Collections.sort relies on the compareTo method which is part of the Comparable interface
        Collections.sort(courseTable);
        //======================================================================//
        System.out.println("SORTED by number");
        //System.out.println(courseTable.toString());
        for (course s : courseTable) {
            System.out.println(s);
        }
        System.out.println("=====================================");
    }

    public void createCourses()
    {
        courseTable.add(new course(97, "Special Topics"));
        courseTable.add(new course(99, "Foreign Studies"));
        courseTable.add(new course(110, "Information, People and Technology"));
        courseTable.add(new course(111, "Seminar in IST"));
        courseTable.add(new course(130, "Emerging Technologies in Popular Culture"));
        courseTable.add(new course(140, "Introduction to Application Development"));
        courseTable.add(new course(197, "Special Topics"));
        courseTable.add(new course(199, "Foreign Studies"));
        courseTable.add(new course(210, "Organization of Data"));
        courseTable.add(new course(220, "Networking and Telecommunications"));
        courseTable.add(new course(222, "Community Informatics"));
        courseTable.add(new course(225, "PC Hardware Basics"));
        courseTable.add(new course(226, "Networking Essentials"));
        courseTable.add(new course(227, "Network Administration"));
        courseTable.add(new course(228, "Advanced Network Administration"));
        courseTable.add(new course(230, "Language, Logic, and Discrete Mathematics"));
        courseTable.add(new course(234, "Digital Cultures"));
        courseTable.add(new course(235, "Gender and the Global Information Technology Sector"));
        courseTable.add(new course(237, "Digital Entrepreneurship"));
        courseTable.add(new course(240, "Introduction to Computer Languages"));
        courseTable.add(new course(242, "Intermediate & Object-Oriented Application Development"));
        courseTable.add(new course(250, "Introduction to Web Design and Development"));
        courseTable.add(new course(255, "Fundamentals of Web Administration"));
        courseTable.add(new course(256, "Programming for the Web"));
        courseTable.add(new course(257, "Advanced Web Administration"));
        courseTable.add(new course(260, "Introduction to Systems Analysis and Design"));
        courseTable.add(new course(261, "Application Development Design Studio I"));
        courseTable.add(new course(294, "Research Project"));
        courseTable.add(new course(296, "Independent Studies"));
        courseTable.add(new course(297, "Special Topics"));
        courseTable.add(new course(298, "Special Topics"));
        courseTable.add(new course(299, "Foreign Studies"));
        courseTable.add(new course(301, "Information and Organizations"));
        courseTable.add(new course(302, "IT Project Management"));
        courseTable.add(new course(310, "Digital Media Metrics"));
        courseTable.add(new course(311, "Object-Oriented Design and Software Applications"));
        courseTable.add(new course(331, "Foundations of Human-Centered Design"));
        courseTable.add(new course(337, "Technologies for Digital Entrepreneurs"));
        courseTable.add(new course(341, "Human Diversity in the Global Information Economy"));
        courseTable.add(new course(361, "Application Development Design Studio II"));
        courseTable.add(new course(389, "Leadership and Technology for Instruction"));
        courseTable.add(new course(390, "Introduction to Professional Development"));
        courseTable.add(new course(397, "Special Topics"));
        courseTable.add(new course(398, "Special Topics"));
        courseTable.add(new course(399, "Foreign Studies"));
        courseTable.add(new course(402, "Emerging Issues and Technologies"));
        courseTable.add(new course(411, "Distributed-Object Computing"));
        courseTable.add(new course(412, "The Engineering of Complex Software Systems"));
        courseTable.add(new course(413, "Usability Engineering"));
        courseTable.add(new course(420, "Fundamentals of Systems and Enterprise Integration"));
        courseTable.add(new course(421, "Advanced Enterprise Integration: Technologies and Applications"));
        courseTable.add(new course(422, "Enterprise Architecture Foundations"));
        courseTable.add(new course(423, "Enterprise Information Management and Storage Architecture"));
        courseTable.add(new course(424, "Architectural Modeling of Organizations"));
        courseTable.add(new course(425, "New Venture Creation"));
        courseTable.add(new course(426, "Invention Commercialization"));
        courseTable.add(new course(431, "The Information Environment"));
        courseTable.add(new course(432, "Legal and Regulatory Environment of Information Science and Technology"));
        courseTable.add(new course(437, "Digital Design & Innovation"));
        courseTable.add(new course(440, "Information Sciences and Technology Integration and Problem Solving"));
        courseTable.add(new course(441, "Information Retrieval and Organization"));
        courseTable.add(new course(442, "Information Technology in an International Context"));
        courseTable.add(new course(443, "IT Professional Services Theory and Practice"));
        courseTable.add(new course(444, "Advanced IT Professional Services"));
        courseTable.add(new course(445, "Globalization Trends and World Issues"));
        courseTable.add(new course(446, "An Introduction to Building Computer/Video Games"));
        courseTable.add(new course(451, "Network Security"));
        courseTable.add(new course(452, "Legal and Regulatory Environment of Privacy and Security"));
        courseTable.add(new course(453, "Legal, Regulatory, Policy Environment of Cyber Forensics"));
        courseTable.add(new course(454, "Computer and Cyber Forensics"));
        courseTable.add(new course(456, "Information Security Management"));
        courseTable.add(new course(461, "Database Management and Administration"));
        courseTable.add(new course(462, "Database Modeling and Applications"));
        courseTable.add(new course(489, "Research Methods for the Information Sciences and Technology"));
        courseTable.add(new course(494, "Research Project"));
        courseTable.add(new course(495, "Internship"));
        courseTable.add(new course(496, "Independent Studies"));
        courseTable.add(new course(497, "Special Topics"));
        courseTable.add(new course(498, "Special Topics"));
    }
}

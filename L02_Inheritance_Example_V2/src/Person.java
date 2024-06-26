/***************************************
* Filename: Person.java
* Short description: This class ...
* @author Nannette D'Imperio
* @version  ??/??/2019
***************************************/

/**
 *
 * @author nxd13
 */
public class Person {
     //---------Declaring attributes---- 
     private String firstName; 
     private String lastName; 
     private int age; 
     //------------------------------ 
     //----------Constructor------------ 
     Person(String a, String b, int c) 
     { 
          firstName = a; 
          lastName = b; 
          age = c; 
     } 
     //---------- METHODS -------- 
     String getInfo() 
     { 
          return "NAME = "+getFirstName()+ " "+getLastName()+" "+"Age = "+ getAge(); 
     } 
     //------------------------------------------------ 
     /** 
      * @return the firstName 
      */ 
     public String getFirstName() { 
          return firstName; 
     } 
     /** 
      * @param firstName the firstName to set 
      */ 
     public void setFirstName(String firstName) { 
          this.firstName = firstName; 
     } 
     /** 
      * @return the lastName 
      */ 
     public String getLastName() { 
          return lastName; 
     } 
     /** 
      * @param lastName the lastName to set 
      */ 
     public void setLastName(String lastName) { 
          this.lastName = lastName; 
     } 
     /** 
      * @return the age 
      */ 
     public int getAge() { 
          return age; 
     } 
     /** 
      * @param age the age to set 
      */ 
     public void setAge(int age) { 
          this.age = age; 
     } 
}

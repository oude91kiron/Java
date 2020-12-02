/* ------------------------------------------------------------------
This class has the junit test cases for Q1.java                     -
-------------------------------------------------------------------*/

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

 public class Q1Test {

   @Test
   public void testGetUserName() {
       Q1 user=new Q1();

       String name=user.getUserName();
//User name shall not exceed 10 characters
       assertTrue(name.length()<=10);
   }

   @Test
   public void testGetPassword() {
       Q1 user=new Q1();

       String pwd=user.getPassword();
//Password length is required to be between 5 and 10 characters.

       assertTrue(pwd.length()>=5 && pwd.length()<=10);
   }
   @Test
   public void testGetResolution() {
       Q1 user=new Q1();

       String res=user.getResolution();
       String [] resArr=res.split("\\*");
       boolean valid=false;
//Profile photo size is required to be less than 20kb and resolution is < (500 x500).

       if(Double.parseDouble(resArr[0])<=500 && Double.parseDouble(resArr[1])<=500)
           valid=true;

       assertTrue(valid);
   }
   @Test
   public void testGetPhotoSize() {
       Q1 user=new Q1();
       boolean valid=false;
       String size=user.getPhotoSize();
       String unitOfSize=size.substring(size.length()-2,size.length());
       StringBuilder sizeNumber=new StringBuilder();
       for(int i=0;i<size.length();i++)
       {
           if(Character.isDigit(size.charAt(i)))
               sizeNumber.append(size.charAt(i));

       }
       if(unitOfSize.toLowerCase().equalsIgnoreCase("mb"))
           valid=false;
       else if(unitOfSize.toLowerCase().equalsIgnoreCase("kb") && Double.parseDouble(sizeNumber.toString())<20 )
           valid=true;

       assertTrue(valid);


   }

   @Test
   public void testGetPhotoFormat()
   {
       boolean valid=false;
       Q1 user=new Q1();
       String format=user.getPhotoFormat();

       //Profile photo format is either .jpg or .jpeg
       if(format.toLowerCase().equals("jpg") || format.toLowerCase().equals("jpeg"))
       valid=true;
       assertTrue(valid);
   }

}
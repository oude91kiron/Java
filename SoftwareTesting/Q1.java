/*---------------------------------------------------------------------------------------
1. Write a program that accepts user details such as user name, password, and           -
profile photo (only file-name, size and extension).                                     -
• User name shall not exceed 10 characters.                                             -
• Password length is required to be between 5 and 10 characters.                        -
• Profile photo size is required to be less than 20kb and resolution is < (500          -
x500).                                                                                  -
• Profile photo format is either .jpg or .jpeg                                          -
                                                                                        -
(This clss just To demonstrates Q1Testing class)                                        -
---------------------------------------------------------------------------------------*/

/**This class has User details**/
public class Q1 {

	public Q1() {

	}

   public String getUserName()
   {
       String username="MyUserName";
       return username;
   }

   public String getPassword()
   {
       String pwd="MyPassword";
       return pwd;
   }

   public String getPhotoSize()
   {
       String size="15kb";
       return size;
   }

   public String getResolution()
   {
       String res="250*300";
       return res;
   }

   public String getPhotoFormat()
   {
       String format="jpeg";
       return format;
   }
}
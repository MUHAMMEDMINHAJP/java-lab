import java.util.*;
import java.util.Scanner;
class StrManipulation
{
public static void main(String[]args)
{
System.out.print("---------------------------------------------------------------------");
System.out.println("\n            ------------STRING FUNCTIONS-------------");
char wrd[]={'e','x','p','l','o','r','e',' ','e','v','e','r','y',' ','m','o','m','e','n','t'};
String newstr=new String(wrd);
System.out.print("\n\nNew String from char[] using new: "+newstr);
byte asciis[]={65,66,67,68,69,70};
String newstr2=new String(asciis);
System.out.print("\n\nNew string of corresponding ascii value from asciis[] using new : "+newstr2);


String s1="Always";
String s2=" Smile!";
System.out.println("\n\nString 1 ="+s1);
System.out.println("\n\nString 2 ="+s2);
System.out.println("\nlength of string 'good' :"+s1.length());
System.out.println("\n"+s1+" to Uppercase  : "+s1.toUpperCase());
System.out.println("\n"+s2+" to Lowercase  : "+s2.toLowerCase());
 

System.out.print("---------------------------------------------------------------------");
System.out.println("\n            --------CONCATENATION---------");
System.out.println("\n\nusing concat()  :"+s1.concat(""+s2));
System.out.println("\n\nusing '+' operator :"+s1+"" +s2);
 
System.out.print("---------------------------------------------------------------------");
System.out.println(" \n            ---------CHARACTER EXTRACTION--------");
System.out.println(" \ncharacter at  3rd position : "+s1.charAt(3));
char c[]= new char[5];
s1.getChars(2,4,c,0);
System.out.println(" \ncharacter between 2 and 4  :"+new String(c));
 


System.out.print("---------------------------------------------------------------------");
System.out.println(" \n              --------CHARACTER COMPARISON---------");
String x="welcome";
String y="thank you";
System.out.println("\nstring 1 :"+x);
System.out.println("\nstring 2 :"+y);
System.out.println("\n"+x+" equals"+x.equals(y));
System.out.println("\n"+x+" equals  Ignorecase" +y+":"+x.equalsIgnoreCase(y));
System.out.println("\n"+x+" compare to "+y+ " :"+x.compareTo(y));
System.out.println("\n"+x+" Start with w :"+x.startsWith("w"));
 


System.out.print("\n---------------------------------------------------------------------");
System.out.println("\n               ---------SEARCH SUBSTRINGS--------");
String z="someone told me,you have attractive smile!......";
 
System.out.println("\n String is :"+z);
System.out.println("\n index of 'attractive' word: "+z.indexOf("attractive"));
System.out.println("\n substring :"+z.substring(16));

System.out.print("\n---------------------------------------------------------------------");
System.out.println("\n             -------STRING MODIFICATION-----");
System.out.println("\n replace 'smile' to 'eyes'  : "+z.replace("smile","eyes"));
 

System.out.print("\n---------------------------------------------------------------------");
System.out.println("\n             -------USING VALUE OF-----");
float n=35.87f;
System.out.println("\n"+n+" is converted to " +String.valueOf(n));
}
}

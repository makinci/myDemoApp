package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
public static boolean method(ArrayList<String> list1,String str1,String str2){
		if(str1.equals("")&&str2.equals(""))
			return false;
		if(list1==null)
			return false;
		String concat = str1+str2;
		if(list1.contains(concat))
			return true;
		else return false;
}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

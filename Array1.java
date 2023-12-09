/*
 *Array Syntax 
 dataType array_name[]=new dataType[size];
 */
import java.util.*;
public class Array1 
{
    public static void main(String arg[])
    {
        /*Creating array in different different type
        int marks[]=new int[50];
        int age[]={12,42,21,14,15};
        String name[]={"Santosh","Sachin","rahul","Ramu","Prakash"};
        */
        int age[]={12,42,21,14,15};
        for(int i=0;i<age.length;i++)
        {
            System.out.println("Array = "+age[i]);     
        }
        
    }  
}

// choose what do you want to find number in Array list
//like Minimum or Maximum

import java.util.Scanner;

public class Array6 
{
    public static void minimum(int number[])
    {  
        int minimum = number[0];  
        for(int i = 1; i < number.length; i++) 
        { 
            if(minimum > number[i])
            {  
                minimum = number[i];  
            }
        }
        System.out.println(minimum);
    }
    
    public static void maximum(int number[])
    {  
        int maximum = number[0];  
        for(int i = 1; i < number.length; i++) 
        { 
            if(maximum < number[i])
            {  
                maximum = number[i];  
            }
        }
        System.out.println(maximum);    
    }    
     
    public static void main(String args[])
    {  
        int a[] = {13, 43, 22, 134, 542, 54};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you choose in Array list: Maximum or Minimum");
        String operation = sc.nextLine();
        switch (operation.toLowerCase()) 
        {
            case "maximum":
                maximum(a);
                break;
            case "minimum":
                minimum(a);
                break;
            default:
                System.out.println("Invalid Operation!");
        }
    }    
}

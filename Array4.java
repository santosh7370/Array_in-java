//creating a method which receives an array as a parameter 
//find minimum number in the Array list 
public class Array4 
{
    public static void minimum(int number[])
    {  
        int minimum=number[0];  
        for(int i=1;i<number.length;i++) 
        { 
            if(minimum>number[i])
            {  
                minimum=number[i];  
            }
        }
        System.out.println(minimum);    
    }    
     public static void main(String args[])
    {  
        int a[]={13,43,22,134,542,54};
        minimum(a);
    } 
}

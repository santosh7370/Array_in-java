//Find Maximum number in the Array list
public class Array5 
{
    public static void Maximum(int number[])
    {  
        int Maximum=number[0];  
        for(int i=1;i<number.length;i++) 
        { 
            if(Maximum<number[i])
            {  
                Maximum=number[i];  
            }
        }
        System.out.println(Maximum);    
    }    
     public static void main(String args[])
    {  
        int a[]={13,43,22,134,542,54};
        Maximum(a);
    } 
}

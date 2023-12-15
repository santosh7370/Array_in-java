//Linear Search for Program 
import java.util.Scanner;

public class Array12 
{
    public static int linearSearch(int num[],int key)
    {
        for(int  i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                return i;
            }
        }
         return -1;
    }
    public static void main(String[] args) 
    {
        int num[]={23,54,52,34,64,63,45,74,4,324,63,345,66,345,24,62,123};
        System.out.println("Enter the number for find index position ");
        Scanner cn=new Scanner(System.in);
        int key=cn.nextInt();
        int index=linearSearch(num, key);
        if(index==-1)
        {
            System.out.println("Not found");
        } 
        else
        {
            System.out.println("key is at index " + index);
        }
    }
}

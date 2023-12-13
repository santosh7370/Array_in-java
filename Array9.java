//Print the Element in revers order.
public class Array9 
{
    public static void main(String[] args) 
    {  
        //Initialize array  
        int [] arr = new int [] {41,2,54,445,24,54,68,48};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) 
        {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}

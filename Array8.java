//Searches for duplicate element 
public class Array8 
{
    public static void main(String[] args) 
    {  
        //Initialize array  
        int [] arr = new int [] {8, 5, 3, 4, 2, 9,23,54,12,2,13,23, 8, 18, 13};  
        System.out.println("Duplicate elements in given array: ");   
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}

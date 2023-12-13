//Print Element in Array list at odd position 
public class Array11 {
     public static void main(String[] args) 
     {  
  
        //Initialize array  
        int [] arr = new int [] {45,14,24,785,145,1,4,1445,145,175,541,482,848,64};  
  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 0 as first odd positioned element is present at position 1.  
        for (int i = 0; i < arr.length; i = i+2) 
        {  
            System.out.println(arr[i]);  
        }  
    }  
}
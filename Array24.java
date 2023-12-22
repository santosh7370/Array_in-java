// Print Third largest number in Array list.
public class Array24 
{
    public static int thirdLargest(int[] a, int total)
    {  
        int temp;  
        for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                }  
            }  
               return a[total-3];  
    } 
    //Also you can use for same operation.
    /* 
    public static int thirdLarget(int[] a, int total)  
    {  
        Arrays.sort(a);  
        return a[total-3];  
    }  
    */ 
    public static void main(String args[])
    {  
        int a[]={1,2,5,6,3,2,4,6,2};  
        int b[]={44,66,99,77,33,22,55,22,53,63,123};  
        System.out.println("Third Largest: "+thirdLargest(a,9));  
        System.out.println("Third Largest: "+thirdLargest(b,11));  
    } 
}

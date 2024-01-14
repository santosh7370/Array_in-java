public class InsertionSort 
{
    public static void sort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int current=arr[i];
            int previous=i-1;
            while(previous>=0 && arr[previous] > current)
            {
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
    }
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr[]={5,3,2,1,7,8,0,9,4};
        sort(arr);
        System.out.println("Insertion Sorted Array");
        printArr(arr);
    }
}

//
public class Array7 
{
    public static int getlargest(int num[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(largest<num[i])
            {
                largest=num[i];
            }
            if(smallest>num[i])
            {
                smallest=num[i];
            }
        }
        System.out.println("Smallest number is ="+smallest);
        return largest;
    }
    public static void main(String[] args) 
    {
        int a[]={23,42,21,433,33,543,1234,5,223};
        System.out.println("Largest nuber is ="+getlargest(a));
    }
}

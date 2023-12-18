//Maximum sum of  Sub Array 
public class Array19 
{
    public static void maxsumofsubArray(int numbers[])
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=i; j<numbers.length; j++)
            {
                int end=j;
                currentsum=0;
                for(int k=start; k<end; k++)
                {
                    currentsum +=numbers[k];
                }
                System.out.println(currentsum);
                if(maxsum < currentsum)
                {
                    maxsum=currentsum;
                }
            }
           
        }
        System.out.print(" sum of maximum for sub Array : = "+maxsum);
    }
    public static void main(String[] args) 
    {
        int numbers[]={2,3,4,5,6,7,8,9};
        maxsumofsubArray(numbers);
    }
}

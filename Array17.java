//Print Pair of two element for each element in Array list And also print Totel number of pairs.
public class Array17 
{
    public static void pair(int numbers[])
    {
        int totel=0;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            int curr = numbers[i];
            for(int j = i + 1; j < numbers.length; j++)
            {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                System.out.print("  ");
                totel++;
            }
            System.out.println();
        }
        System.out.println("Totel numbers of posible in Array list : = "+totel);
    }

    public static void main(String[] args) 
    {
        int numbers[] = {2, 1, 4, 21, 43, 23, 54, 65, 64};
        pair(numbers);
    }
}

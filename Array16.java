//Print Pair of two element for each element in Array list.
import java.util.ArrayList;
import java.util.Scanner;

public class Array16 
{
    public static void pair(int numbers[])
    {
        for(int i = 0; i < numbers.length - 1; i++)
        {
            int curr = numbers[i];
            for(int j = i + 1; j < numbers.length; j++)
            {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int numbers[] = {2, 1, 4, 21, 43, 23, 54, 65, 64};
        pair(numbers);
    }
}

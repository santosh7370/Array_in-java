// Reverse program for Array list in java
public class Array14
{
    public static void reverse(int numbers[])
    {
        int first=0, last=numbers.length-1;
        while (first<last) 
        {
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) 
    {
        int numbers[]={12,32,23,43,34,33,123,234,54,12345,631,524};
        reverse(numbers);
        System.out.println("Reverse of Array list:");
        for(int i=0; i<numbers.length;i++)
        {
            System.out.print(numbers[i]+"  ");
        }
        System.out.println();
    }
}
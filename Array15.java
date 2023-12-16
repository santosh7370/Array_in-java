import java.util.ArrayList;
import java.util.Scanner;

public class Array15 
{
    public static void main(String[] args) 
    {
        Scanner sn= new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter the size of the ArrayList: ");
        int size = sn.nextInt();
        System.out.println("Enter elements for the ArrayList:");
        for (int i = 0; i < size; i++) {
            int element = sn.nextInt();
            arrayList.add(element);
        }
        System.out.println("Original ArrayList: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int first = 0;
        int last = list.size() - 1;
        while (first < last) {
            
            int temp = list.get(first);
            list.set(first, list.get(last));
            list.set(last, temp);

            first++;
            last--;
        }
    }
}

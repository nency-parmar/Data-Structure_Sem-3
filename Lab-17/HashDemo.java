import java.util.Arrays;
import java.util.Scanner;

public class HashDemo 
{
    static int[] hash = new int[20]; //Size of Hash Table is 20...

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        for (int i=0;i<arr.length;i++) 
        {
            System.out.println("Enter an Element at Index : "+i);
            arr[i] = sc.nextInt();
        }

        store(arr);
        System.out.println(Arrays.toString(hash));
        sc.close();
    }

    public static void store(int[] arr) 
    {
        for (int i=0;i<arr.length;i++) 
        {
            int index = hashFn(arr[i]);
            hash[index] = arr[i];
        }
    }

    public static int hashFn(int n) 
    {
        int index = (n % 18) + 2;
        if (hash[index] != 0) 
        {
            // Find the next available slot
            while (hash[index] != 0) 
            {
                index = (++index) % 20;
            }
        }
        return index;
    }
}
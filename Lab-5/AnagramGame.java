import java.util.*;
public class AnagramGame
{
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter String in an Array : ");
            str[i]=sc.next();
        }
        
        int index=(int)(Math.random()*n);
        System.out.println(index);
        System.out.println("Enter Any Word : ");
        String word = sc.next();
        char[] ch1 = new char[word.length()];
        char[] ch2 = new char[word.length()];
        if(word.length()!=str[index].length())
        {
            System.out.println("Word is Not Anagram.");
        }
        else
        {
            ch1 = str[index].toCharArray();
            ch2 = word.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    System.out.println("Word is Not Anagram.");
                    return;
                }
            }
            System.out.println("Word is Anagram.");
        }
    }
}
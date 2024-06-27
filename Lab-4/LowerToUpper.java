import java.util.*;
public class LowerToUpper
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Real String is : "+str);
        String str2="";
        for (int i=0;i<str.length();i++) 
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch=(char)(ch+32);
             }
            else if (ch>='a' && ch<='z') 
            {
                ch = (char)(ch-32);     
            }
            str2 = str2+ch;   
            }
            System.out.println("Converted String is : "+str2);
        }
    }

    // ASCII Values Of a-z                   
    // 'a' = 97  If we will do (97-32) we will got ASCII Value of A.              
    // 'b' = 98   Same Here. And So On.             

     // ASCII Values Of A-Z

    //'A' = 65 If we will do (65+32) we will got ASCII Value of a.
    //'B' = 66 Same Here. And So On.
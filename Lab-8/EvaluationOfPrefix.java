import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPrefix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prefix");
        String prefix = sc.nextLine();
        System.out.println(evaluate(prefix));
    }
    public static int performOperation(int operand1, int operand2, char temp)
    {
        int value;
        switch (temp) 
        {
            case '+':
                value = operand2 + operand1;
                break;
            case '-':
                value = operand2 - operand1;
                break;
            case '*':
                value = operand2 * operand1;
                break;
            case '/':
                value = operand2 / operand1;
                break;
            default:
                throw new AssertionError();
        }
        return value;
    }
    public static int evaluate(String prefix)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = prefix.length()-1; i >= 0; i--)
        {
            char temp = prefix.charAt(i);
            if(Character.isDigit(temp))
            {
                s.push(Integer.parseInt(String.valueOf(temp)));
            }
            else
            {
                int operand2 = s.pop();
                int operand1 = s.pop();
                int ans = performOperation(operand1, operand2, temp);
                s.push(ans);
            }
        }
        return s.pop();
    }
}

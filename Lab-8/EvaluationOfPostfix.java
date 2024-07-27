import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostfix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Postfix ");
        String postfix = sc.nextLine();
        System.out.println(evaluate(postfix));
    }
    public static int performOperation(int operand1, int operand2, char temp)
    {
        int value;
        switch (temp) 
        {
            case '+':
                value = operand1 + operand2;
                break;
            case '-':
                value = operand1 - operand2;
                break;
            case '*':
                value = operand1 * operand2;
                break;
            case '/':
                value = operand1 / operand2;
                break;
            default:
                throw new AssertionError();
        }
        return value;
    }
    public static int evaluate(String postfix)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < postfix.length(); i++)
        {
            char temp = postfix.charAt(i);
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

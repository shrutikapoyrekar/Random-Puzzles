
import java.util.Stack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shrutika Poyrekar
 */
public class Level2 
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        String S = "{{[{{{{}}{{}}}[]}[][{}][({[(({{[][()()]}}{[{{{}}}]}))][()]{[[{((()))({}(())[][])}][]()]}{()[()]}]})][]]}{{}[]}}";
        
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='{')
                s.add(S.charAt(i));
            else if(S.charAt(i)=='(')
                s.add(S.charAt(i));
            else if(S.charAt(i)=='[')
                s.add(S.charAt(i));
            else if(S.charAt(i)=='}')
            {
                char temp = s.peek().toString().charAt(0);
                if(temp == '{')
                    s.pop();
                else
                {
                    System.out.println(i);
                    break;
                }
                    
            }
            else if(S.charAt(i)==')')
            {
                char temp = s.peek().toString().charAt(0);
                if(temp == '(')
                    s.pop();
                else
                {
                    System.out.println(i);
                    break;
                }
            }
            else if(S.charAt(i)==']')
            {
                char temp = s.peek().toString().charAt(0);
                if(temp == '[')
                    s.pop();
                else
                {
                    System.out.println(i);
                    break;
                }
            }
            
        }
    }
}

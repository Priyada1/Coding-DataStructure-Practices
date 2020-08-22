import java.util.Stack;

public class testp1 {

    public static void main(String[] args)
    {
        String s="{}[()][]{}]{}";
        Stack<Character> stack=new Stack<Character>();

        Boolean flag=false;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' ||s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty())
                {
                    flag = false;
                }
                else{
                    char pop_val=stack.pop();
                    if(s.charAt(i) == ')' && pop_val != '(')
                    {
                        flag=false;
                    }
                    else if(s.charAt(i) == '}' && pop_val !='{')
                    {
                        flag =false;
                    }
                    else if(s.charAt(i) == ']' && pop_val != '[')
                    {
                        flag = false;
                    }
                }
            }
        }

        if(stack.isEmpty())
        {
            flag=true;
        }
        else{
            flag = false;
        }

        if( flag == true)
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("un  Balanced");
        }
        }
}

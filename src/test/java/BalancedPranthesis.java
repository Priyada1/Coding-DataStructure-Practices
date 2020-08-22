import java.util.Stack;

public class BalancedPranthesis {

    public static void main(String[] args)
    {
        String s="{}[()][]{}]{}[]";
        Stack<Character> stack=new Stack<Character>();

        Boolean flag=false;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{' ) {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[' ) {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(' ) {
                stack.pop();
            }
        }
        if(stack.isEmpty())
        {
            flag = true;
        }
        if( flag)
        {
            System.out.println("Balanced ");
        }
        else{
            System.out.println("UN-Balanced ");
        }
    }
}

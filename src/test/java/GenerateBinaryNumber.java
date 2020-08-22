import java.util.Stack;

public class GenerateBinaryNumber {

    public static void main(String[] args)
    {
        int number=5;
        for(int i=1;i<=number;i++) {
            int num = i;
            Stack<Integer> stack = new Stack<Integer>();
            while (num != 0) {
                int rem = num % 2;
                stack.push(rem);
                num = num / 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }

    }
}

import java.util.Stack;

public class findNextGreaterNumber {

    public static void main(String[] args)
    {
        int[] arr={13,7,6,12,3,9};
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i == arr.length-1)
            {
                stack.push(-1);
            }
            if(arr[i]<arr[i+1])
            {
                stack.push(arr[i+1]);
            }
            else{

            }

        }
    }
}

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args)
    {
        int[] arr={100,80,60,70,60,75,85};
        usingStack(arr);
        int[] res=new int[arr.length];
        res[0]=1;
        for(int i=1;i<arr.length;i++)
        {
           int count =1;
           for(int j=i-1;j>0;j--)
           {
               if(arr[i]>arr[j]) {
                   count++;
               }
           }
           res[i] = count;
        }
        for(int a:res)
        {
            System.out.print(a+"   ");
        }
    }

    public static void  usingStack(int[] arr)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res=new int[arr.length];
        res[0]=1;
        stack.push(0);
        for(int i=1;i<arr.length;i++)
        {

            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]) {
                stack.pop();
            }
                res[i]=(stack.isEmpty()?(i+1):(i-stack.peek()));
                stack.push(i);
        }

        for(int a:res)
        {
            System.out.print(a+"   ");
        }

        System.out.println();
    }
}

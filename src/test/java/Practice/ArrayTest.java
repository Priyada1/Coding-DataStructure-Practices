package Practice;

public class ArrayTest {


    public static void main(String[] args)
    {
        int[] arr={-4,5,-2,-1,8,9,-2,30,20};
        int n=arr.length;
        int sum=findMaxSumArray(arr,n);
        System.out.println("max SubArray Sum :"+sum);
    }

    public static int findMaxSumArray(int[] arr,int n)
    {
        int currMax=arr[0];
        int totalMax=arr[0];
        for(int i=1;i<n;i++)
        {
            currMax=Math.max(arr[i],currMax+arr[i]);
            totalMax=Math.max(totalMax,currMax);
        }

        return totalMax;
    }
}

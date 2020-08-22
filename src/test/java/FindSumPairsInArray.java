import java.util.HashSet;

public class FindSumPairsInArray {

    public static void main(String[] args)
    {
        int[] arr={1,4,2,3,-2,5,2,-5};

        int sum=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int x=sum-arr[i];
            if(set.contains(arr[i]))
            {
                System.out.println("got the pairs "+x +" and  "+arr[i]);
            }
            set.add(x);
        }
    }
}

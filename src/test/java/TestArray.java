public class TestArray {

    public static void main(String[] args)
    {
        int[] arr={1,4,2,3,-2,3,5,2,-5,3};

       int[] newArr= deleteValueFromArray(arr,3);
       for(int a:newArr)
       {
           System.out.println(a);
       }
    }

    public static int[] deleteValueFromArray(int [] arr,int val)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                continue;
            }
            arr[j]=arr[i];
            j++;
        }
        return  arr;
    }
}

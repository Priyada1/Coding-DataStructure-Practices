import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class QuickSort {

    public static void main(String[] args)
    {
        int[] arr={2,4,6,6,4,8,1,2,9,6,6,6,4};
        System.out.println(arr.length);
        int[] newArray = new int[arr.length-1];
        int index=3;
        int j=0;
     for(int k=0;k<arr.length;k++)
     {
         if(k==index)
         {
             continue;
         }
         else{
             newArray[j++]=arr[k];
         }
     }

        for(int a:newArray)
        {
            System.out.print(a+"   ");
        }

System.out.println();
        System.out.println("length after deletion >>>"+newArray.length);

        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"      "+entry.getValue());
        }


    }
}

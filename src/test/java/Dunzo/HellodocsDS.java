package Dunzo;

public class HellodocsDS {

    public static void main(String[] arg)
    {
        int[][] arr={{1,2},{3,4,5},{6,7,8},{9,10}};

        int[] array = solution1(arr);
        for(int a:array)
        {
            System.out.println(a);
        }

        int[] a2 = solutionByUsingRecursion(arr);
    }

    public static int[] solution1(int[] [] arr)
    {
        int[] array=new int[10];
        int j=0;
        for(int[] record:arr)
        {
            for(int i=0;i<record.length;i++)
            {
                array[j]=record[i];
                j++;
            }
        }
        return array;
    }

    public static int[] solutionByUsingRecursion(int[][] arr)
    {
        int[] newArr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            int j=arr[i].length;
            getArray(arr,i,j,newArr);
        }
        return newArr;
    }

    public static int getArray(int[][] arr,int i,int j,int[] newArr)
    {
     return 0;
    }
}

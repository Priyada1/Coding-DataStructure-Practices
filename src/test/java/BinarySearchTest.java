public class BinarySearchTest {

    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,10,15,22,27,30};
        int target=5;
        int n=binarySearch(arr,target,0,arr.length);
        if(n==1)
        {
            System.out.println("found");
        }
        else{
            System.out.println("not found ");
        }
    }

    public static int binarySearch(int[] arr,int t,int low,int high)
    {

        int flag=-1;

        while(low<high) {
            int mid = (low + high) / 2;

            if (arr[mid] == t) {
                flag = 1;
                break;
            } else if (arr[mid] < t) {
                return binarySearch(arr, t, mid + 1, high);
            } else if (arr[mid] > t) {
                return binarySearch(arr, t, low, mid - 1);
            } else {
                flag = -1;
            }
        }
        return flag;
    }
}

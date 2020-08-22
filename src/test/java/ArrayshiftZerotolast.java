import java.util.ArrayList;

public class ArrayshiftZerotolast {

    public static void main(String[] args)
    {
        ArrayList<Object> a= new ArrayList<Object>();

        int i=0;
        while(i<5)
        {
            a.add(i++);
        }
        System.out.println(a.size());
        a.add(6);
        a.add("s");
        a.add(7);
         a.add(7,78);
         a.remove(5);
        for(int j=0;j<a.size();j++)
        {
            System.out.println(a.get(j));
        }
    }
}

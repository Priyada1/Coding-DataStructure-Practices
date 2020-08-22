import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args)
    {
        int[] a={2,6,2,7,9,9,11,2,3,4,12,7,7,7,9,18};

        Map<Integer,Integer> m=new HashMap<Integer, Integer>();

        for(int b:a)
        {
            if(m.containsKey(b))
            {
                int count=m.get(b)+1;
                m.put(b,count);
            }
            else
            m.put(b,1);
        }

        for(Map.Entry<Integer,Integer> entry:m.entrySet())
        {
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
        System.out.println(">>>>>"+m.size());
        System.out.println(a.length);
    }
}

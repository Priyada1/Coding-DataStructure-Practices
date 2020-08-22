import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DummyTest {

    public static void main(String[] args)
    {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(7);
        l1.add(10);
        l1.add(2);
        ArrayList<Integer> l2= new ArrayList();
        l2.add(3);
        l2.add(8);
        l2.add(17);
        l2.addAll(l1);
        Collections.sort(l2);
        Iterator<?> itr=l2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        String words[] = { "welcome", "to", "geeks", "portal"};
        String str="geeksforgeeks is a computer science portal for geeks.";
        int count=0;
        Pattern p=Pattern.compile("[A-Za-z]+");
        Matcher m=p.matcher(str);

        HashSet<String> set= new HashSet<String>();
        for(String s:words)
        {
            set.add(s);
        }

        while(m.find())
        {
            if(set.contains(m.group()))
            {
                count++;
            }
        }

        System.out.println(count);


    }
}

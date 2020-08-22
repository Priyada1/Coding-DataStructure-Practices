import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KthFrequentChar {

    public static void main(String[] args) {
        String str1 = "GeeksforgeekskGs";
        int k = 3;
       Map<Character,Integer> mp=new HashMap<Character, Integer>();
       String str=str1.toLowerCase();
       for(int i=0;i<str.length();i++)
       {
           if(mp.containsKey(str.charAt(i)))
           {
               int count = mp.get(str.charAt(i));
               count++;
               mp.put(str.charAt(i),count);
           }
           else{
               mp.put(str.charAt(i),1);
           }
       }


       for(Map.Entry<Character,Integer> entry:mp.entrySet())
       {
           System.out.println(entry.getKey()+"       "+entry.getValue());
       }
    }

}

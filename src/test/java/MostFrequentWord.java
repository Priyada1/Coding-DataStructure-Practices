import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostFrequentWord {

    public static void main(String[] args)
    {
       String s1 ="learn geeks geeks for geeks is best place to learn";
        String s2 = "bad place place test";

        String[] s11=s1.split(" ");
        String[] s12= s2.split(" ");
        HashMap<String,Integer> mapWithFrequencyCount=frequencyCountOfWords(s11);
        printMap(mapWithFrequencyCount);
        HashSet<String> s12_set=new HashSet<String>();
        for(String s:s12)
        {
            s12_set.add(s);
        }
        for(String s:s12_set)
        {
            System.out.print(s+"  ");
        }

        for(Map.Entry<String,Integer> map:mapWithFrequencyCount.entrySet())
        {
          //  if(s12_set.contains(mapWithFrequencyCount.get(map.getKey()))
            {
                mapWithFrequencyCount.remove(map.getKey());
            }
        }

                printMap(mapWithFrequencyCount);
    }

    public static HashMap<String,Integer> frequencyCountOfWords(String[] s11)
    {
        HashMap<String,Integer> map= new HashMap<String, Integer>();
        for(int i=0;i<s11.length;i++)
        {
            if(map.containsKey(s11[i]))
            {
                int count = map.get(s11[i]);
                count++;
                map.put(s11[i],count);

            }
            else
                map.put(s11[i],1);
        }
        return map;
    }

    public static void printMap(HashMap<String,Integer> map )
    {
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}


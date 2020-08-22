package Practice.Graph;

import java.util.*;

public class TownJudge {

    /*
    In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
     */
    public static void main(String[] args)
    {
        int[][] trust={{1,3},{2,3}};
        int judge= findJudgeUsingHashMap(3, trust);
        System.out.println(" Judge is :"+judge);
    }

    public static int findJudgeUsingHashMap(int n, int[][] trust)
    {
        HashMap<Integer, List<Integer>> trustMap = new HashMap<Integer, List<Integer>>();
     /*
      Create a Map of Person to whom he Trusts
      */
        for(int[] record:trust)
        {
            int a= record[0];
            int b = record[1];

            List<Integer> li = trustMap.get(a);

            if(li == null)
            {
                li = new ArrayList<Integer>();
            }
            li.add(b);
            trustMap.put(a,li);
        }

        /*
          Iterate the values and create a Map of TrustCount (Person and how many people trust them)
         */
     Map<Integer,Integer> trustCount = new HashMap<Integer, Integer>();

        for(List<Integer> countValue: trustMap.values())
        {
            for(Integer value : countValue)
            {
                    trustCount.put(value, trustCount.getOrDefault(value,0) + 1);

            }
        }

        /*
        if we found the value whom everyone trust and he does not trust anyone then that's output
         */

        for(Integer key: trustCount.keySet())
        {
            if(trustCount.get(key) == n-1 && !trustMap.containsKey(key))
            {
                return key;
            }
        }

        return -1;
    }
}

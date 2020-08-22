import java.util.HashMap;

public class LengthOfLastWord {


    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        char c=0;
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                c=str.charAt(i);
                break;
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(c);
    }
}

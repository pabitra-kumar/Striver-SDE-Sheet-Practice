import java.util.*;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int length = 0 , i = 0 , j = 0 ;
        HashMap<Character , Integer> m = new HashMap<>();
        while(j < s.length())
        {
            char c = s.charAt(j);

            if(m.containsKey(c) && m.get(c)>=i)   i = m.get(c) + 1;
            else
                length = Math.max(length , j-i+1);
    
            m.put(c,j);
            j++;
        }
        return length;
    }
}

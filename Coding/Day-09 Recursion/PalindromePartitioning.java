import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aabb";
        PalindromePartitioning ob = new PalindromePartitioning();
        List<List<String>> ans = ob.partition(s);
        System.out.println(ans);
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        count(s , new ArrayList<>() , ans);
        return ans;
    }

    static void count(String s , List<String> ds , List<List<String>> ans)
    {
        int n = s.length();
        if(n == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0 ; i < n ; i++)
        {
            if(isPalindrome(s.substring(0 , i+1)))
            {
                ds.add(s.substring(0 , i+1));
                count(s.substring(i+1 , n) , ds , ans);
                ds.remove(ds.size() - 1);
            }
        }
    }
    
    static boolean isPalindrome(String s)
    {
        for(int i = 0; i < (s.length()+1)/2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
            return false;
        }
        return true;
    }
}

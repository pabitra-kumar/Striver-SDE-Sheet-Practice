import java.util.*;

public class maximumProfit {
    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }} ;
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(ArrayList<Integer> prices){
        int max = 0 , low = prices.get(0);
        for(int i =0 ; i<prices.size() ; i++)
        {
            int j = prices.get(i);
            if(j<low) low =j;
            else if(j-low > max) max = j-low;
        }
        return max;
    }
}

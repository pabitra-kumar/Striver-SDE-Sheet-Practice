import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double i = a.value*1.0/a.weight;
        double j = b.value*1.0/b.weight;
        if(i > j)
        return -1;
        else
        return 1;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        Item arr[] = {new Item(60, 10), new Item(100, 20), new Item(120, 30)};
        int W = 50;
        int n = arr.length;
        double ans = fractionalKnapsack(W, arr, n);
        System.out.println(ans);
    }
    static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        ItemComparator ic = new ItemComparator();
        Arrays.sort(arr , ic);
        double res = 0;
        for(Item i : arr)
        {
            int wt = i.weight;
            int val = i.value;
            if(wt <= W)
            {
                W -= wt;
                res += (double)val;
            }
            else
            {
                res += (val*1.0/wt)*W;
                break;
            }
        }
        return res;
        
    }
}



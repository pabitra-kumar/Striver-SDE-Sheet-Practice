import java.util.*;

// Tortoise Method

public class duplicateNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);add(9);add(1);add(7);add(4);
            add(6);add(9);add(3);add(8);add(5);
        }};
        int res = findDuplicate(arr, arr.size());
        System.out.println(res);

    }
    public static int findDuplicate(ArrayList<Integer> arr, int n){

        int slow = arr.get(0) , fast = arr.get(0);

        do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        }while(slow!=fast);

        fast = arr.get(0);

        while(slow!=fast)
        {
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        
        return slow;


        // while(true){
        //     if(arr.get(0)!= arr.get(arr.get(0)))
        //     {
        //         int temp = arr.get(arr.get(0));
        //         arr.set(arr.get(0),arr.get(0));
        //         arr.set(0,temp); 
        //     }
        //     else
        //     return arr.get(0);
        // }
    }
}

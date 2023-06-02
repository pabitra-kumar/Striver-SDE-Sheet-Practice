import java.util.*;

public class ReversePairs {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(40); add(25); add(19);
            add(12); add(9); add(6);
            add(2);
        }};
        System.out.println(reversePairs(arr));
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {

        return _mergeSort(arr, 0, arr.size()-1);
    }
    public static int _mergeSort(ArrayList<Integer> arr , int left , int right)
    {
        int mid, inv_count = 0;
        if(left < right)
        {
            mid = (left + right) / 2 ;

            inv_count += _mergeSort(arr, left, mid);
            inv_count += _mergeSort(arr, mid + 1, right);

            inv_count += reverseCount(arr, left, mid + 1, right);

        }
        return inv_count;
    }

    public static int reverseCount(ArrayList<Integer> arr , int left , int mid ,  int right)
    {
        int rev_count = 0 , i , j;
        i=left;
        j=mid;
        
        while(i <= mid-1) {

            if(j>right)
            {
                rev_count += j-mid ;
                i++;
                continue;

            } 
            // here the both side conditions will be converted to long in leetcode
            if(arr.get(i) <= arr.get(j) * 2)
            {
                rev_count += j - mid ;
                i++;
            }
            else
            {
                j++;
            }

        }

        merge(arr, left, mid, right);

        return rev_count;
    }



    public static void merge(ArrayList<Integer> arr , int left , int mid ,  int right)
    {
        int i,j;
        i = left;
        j = mid;
        ArrayList<Integer> temp = new ArrayList<>();
        while((i <= mid-1) && (j <= right))
        {
            if(arr.get(i) <= arr.get(j))
            {
                temp.add(arr.get(i++));
            }
            else
            {
                temp.add( arr.get(j++));
            }
        }

        while(i <= mid-1)
        {
            temp.add(arr.get(i++));
        }
        while(j <= right)
        {
            temp.add(arr.get(j++));
        }
        for(i=left ; i <= right ; i++)
        {
            arr.set(i , temp.get(i-left));
        }
    }
}

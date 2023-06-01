public class InversonOfArray {
    public static void main(String[] args) {
        long[] arr = {4,3,2,1};
        System.out.println(getInversions(arr , arr.length));
    }
    public static long getInversions(long arr[], int n) {
        long[] temp = new long[n];

        long ans = _mergeSort(arr, temp, 0 , n-1);
        return ans;
    }
    public static int _mergeSort(long[] arr , long[] temp , int left , int right)
    {
        int mid, inv_count = 0;
        if(left < right)
        {
            mid = (left + right) / 2 ;

            inv_count += _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);

            inv_count += merge(arr , temp , left , mid + 1 , right);

        }
        return inv_count;
    }

    public static int merge(long[] arr , long[] temp , int left , int mid ,  int right)
    {
        int i,j,k,inv_count = 0;
        i = left;
        j = mid;
        k = left;
        while((i <= mid-1) && (j <= right))
        {
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                inv_count += mid-i ;
            }
        }

        while(i <= mid-1)
        {
            temp[k++] = arr[i++];
        }
        while(j <= right)
        {
            temp[k++] = arr[j++];
        }
        for(i=left ; i <= right ; i++)
        {
            arr[i] = temp[i];
        }
        return inv_count;
    }
}

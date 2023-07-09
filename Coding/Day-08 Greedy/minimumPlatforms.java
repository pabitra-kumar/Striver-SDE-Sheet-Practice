import java.util.Arrays;

public class minimumPlatforms {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        int ans = minPlatform(arr, dep, n);
        System.out.println(ans);
    }
    static int minPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int need = 1 , res = 1;
        int i = 1 , j = 0;
        while(i < n && j < n)
        {
            if(arr[i] <= dep[j])
            {
                need++;
                i++;
            }
            else
            {
                need--;
                j++;
            }

            if(need > res)
            {
                res = need;
            }
        }
        return res;
    }
}

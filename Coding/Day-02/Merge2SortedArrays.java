import java.util.*;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 5, 6, 8, 9, 10, 12, 15, 0, 0 };
        int arr2[] = { 2, 5 };
        arr1 = ninjaAndSortedArrays(arr1, arr2, arr1.length - arr2.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {

        // GAP Method

        for (int i = m; i < m + n; i++) {
            arr1[i] = arr2[i - m];
        }
        for (int i = (m + n + 1) / 2; i >= 1; i = (i + 1) / 2) {
            for (int j = i; j < m + n; j++) {
                if (arr1[j] < arr1[j - i]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j - i];
                    arr1[j - i] = temp;
                }
            }
            if (i == 1)
                break;
        }
        return arr1;
    }
}

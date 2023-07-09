import java.util.*;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class MaxJobProfit {
    public static void main(String[] args) {
        Job arr[] = { new Job(1, 2, 100), new Job(2, 1, 19), new Job(3, 2, 27), new Job(4, 1, 25), new Job(5, 1, 15) };
        int n = arr.length;
        int ans[] = JobScheduling(arr, n);
        System.out.println(Arrays.toString(ans));

    }

    static int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        // for (Job i : arr) {
        //     System.out.println(i.id + " " + i.deadline + " " + i.profit);
        // }
        int store[] = new int[arr.length + 1];
        int count = 0, res = 0;
        for (Job i : arr) {
            int deadline = i.deadline;
            int profit = i.profit;
            if (store[deadline] == 0) {
                res += profit;
                count++;
                store[deadline] = 1;
            } else {
                while (deadline > 0) {
                    if (store[deadline] == 0) {
                        res += profit;
                        count++;
                        store[deadline] = 1;
                        break;
                    }
                    deadline--;
                }
            }
        }

        return new int[] { count, res };
    }
}

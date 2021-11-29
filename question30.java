import java.util.Arrays;

public class question30 {
    //distribute m no. of chocolate packets from an array of chocolate packets such that each child should get chocolates with minimum difference

    static int minDiff(int arr[], int n, int m) { //m represents the no of packet each children must get  // arr contain the array of packets
        if (m > n)         //if no of packets is greater than array length return immediately
            return -1;
        Arrays.sort(arr); //sort the array
        int res = arr[m - 1] - arr[0]; //result initialization
        for (int i = 0; (i + m - 1) < n; i++)
            res = Math.min(res, arr[i + m - 1] - arr[i]); // min of res and differance
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7, 3, 2, 4, 9, 12, 56};

        int n = arr.length;
        int m = 3;

        System.out.print(minDiff(arr, n, m));

    }
}

//TC-O(n log n)

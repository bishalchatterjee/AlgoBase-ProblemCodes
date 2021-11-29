import java.io.*;
import java.lang.*;
import java.util.*;
public class question23 {

   static long maxProduct(int[] arr, int n) {
        long res = arr[0];

        for (int i = 0; i < n; i++) {
            long curr = 1;

            for (int j = i; j < n; j++) {
                curr = curr * arr[j];

                res = Math.max(res, curr);
            }
        }

        return res;
    }


    public static void main(String args[]) {
        int arr[] = {6, -3, -10, 0, 2}, n = arr.length;

        System.out.println(maxProduct(arr, n));

    }
}

//TC-O(n*n)




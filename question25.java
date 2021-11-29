import java.util.HashMap;
import java.util.Map;

public class question25 {

    //Function to find all elements in array that appear more than n/k times.
    static int countElements(int[] arr, int n, int k) {
        // your code here,return the answer
        int barrier = n / k;
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > barrier) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
        int n = 12;
        int k = 4;
        System.out.println(countElements(arr,n,k));
    }
}

//O(n)









import java.util.HashSet;
//why hashset?
//allows O(1) evaluation of expressions and removes duplicate elements in the array by storing them only once.
public class question24 {
    //to find longest sub sequence sub-array in an array

    static int longestConsecutiveSubArray(int arr[], int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        //adding array elements to hashset
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {

            if (!set.contains(arr[i] - 1)) { //checks if the previous consecutive element before arr[i] is already present in the set then
                                             // arr[i] cant be the starting element of the consecutive sub array if previous to arr[i-1] is present and is consecutive to arr[i].
                int val = arr[i] + 1;    //val contains next consecutive element after arr[i] (because consecutive elements difference is 1.
                while (set.contains(val))   //if the set contains consecutive elements after arr[1]
                    val++;
                res = Math.max(res, val - arr[i]);    //gets the max of res and ((arr[i]+1)-arr[i]
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 1, 3, 5, 9};
        int n = arr.length;
        System.out.println(longestConsecutiveSubArray(arr, n));
    }
}


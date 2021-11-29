public class question440 {
    //Find the two non-repeating elements in an array of repeating elements
    //using bitwise XOR
    //can also be done using hashmap
    /*
Input:
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4
Explanation:
3 and 4 occur exactly once.
     */

    public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {

            // Xor  all the elements of the array
            // all the elements occurring twice will
            // cancel out each other remaining
            // two unique numbers will be xored
            sum = (sum ^ arr[i]);
        }

        // Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum containing
        // only the rightmost set bit
        sum = (sum & -sum);

        // sum1 and sum2 will contains 2 unique
        // elements elements initialized with 0 box
        // number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;

        // traversing the array again
        for (int i = 0; i < arr.length; i++) {

            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {

                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }

        // print the the two unique numbers
        System.out.println("The non-repeating elements are "
                + sum1 + " and " + sum2);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
        int n = arr.length;
        UniqueNumbers2(arr, n);
    }

}

//TC-O(n)
//Space-O(1)

/*
//TC-O(n log n)
//SC-O(n)



//hashmap

      public static void print2SingleNumbers(int[] nums){
      TreeMap<Integer, Integer> map = new TreeMap<>();

        int n = nums.length;


          for(int i = 0; i<n; i++){
        if(map.containsKey(nums[i]))
        map.remove(nums[i]);
        else
        map.put(nums[i],1);
        }

        System.out.println("The non-repeating integers are " + map.firstKey() + " " + map.lastKey());
      }



 */


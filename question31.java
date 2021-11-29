public class question31 {
    //find smallest sub-array with sum greater than the given sum
    //used sliding window technique;
    static int maxSumGreaterThanGivenSum(int arr[],int n , int given_sum) {

        //initialize window start & end
        int start = 0, end = 1;
        int res = Integer.MAX_VALUE; //set to max int value to get the first min comparison with sum
        int sum = arr[start];
        if (sum > given_sum) return 1;   //if there is only one element and sum(value of that element)is already greater than sum then return 1;

        if (end < n) sum += arr[end];   //if end is less than length of arr  then add it to sum

        while (start < n && end < n) {   //when both the window start and end are less than arr length
            if (sum > given_sum) {            //if sum is greater than the given sum
                res = Math.min(res, end - start + 1);       //compare min of res and window ((end-start)+1)
                sum -= arr[start];     // when window is already complete, we check if it still satisfy sum>given sum by removing from first element and so on
                start++;       //increment the window start index
            } else {
                end++;         // else add element to window
                if (end < n)
                    sum += arr[end];
            }
        }
        return res;
    }


    public static void main(String args[]) {
        int arr[] = {1, 4, 45, 6, 0, 19}, n = arr.length;
        int given_sum=51;
//        int arr[] = {2}, n = arr.length;
//        int given_sum=1;

        System.out.println(maxSumGreaterThanGivenSum(arr, n,given_sum));

    }
}


//TC- O(n)
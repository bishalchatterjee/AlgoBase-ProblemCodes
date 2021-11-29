import java.util.HashSet;
import java.util.Set;

public class question21 {
    //find sub-array with given sum
    static boolean subArrayWithGivenSum(int arr[],int n, int given_sum){
        Set<Integer> set = new HashSet<Integer>(); //using a hashset
        int pre_sum=0;
        for (int x :arr)
        {
            pre_sum+=x;
            if(pre_sum==given_sum) return true; // handel the corner case for sorted elements sum
            if (set.contains(pre_sum-given_sum)==true)  //if the value after subtracting pre_sum with given_sum, is found in the hashset the return;
                return true;
            set.add(pre_sum);

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,-1,2,3,4,5};
        int given_sum=0;
        int n= arr.length;
        System.out.println(subArrayWithGivenSum(arr,n,given_sum));
    }
}


//TC-O(n){for for each loop traversal
//TC-O(n){for hashset}


/*  Alternative for for each loop segment

        for(int i = 0; i < n; i++)
        {
            if(pre_sum==given_sum)
                return true;
            pre_sum += arr[i];
            if(s.contains(pre_sum-given_sum) == true)
                return true;

            set.add(pre_sum);
        }

 */
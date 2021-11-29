import java.util.Arrays;

public class question11 {
    //first approach
    //sorting + linear search

    static int findDuplicate(int arr[]){
        Arrays.sort(arr);
        // we traverse from second element as we need to check with the previous element
        for (int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1])
            return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,1,5,5,6};
        System.out.println(findDuplicate(arr));
    }
}

//TC-O(n log n){for Arrays.sort}
//SC-O(1)


//Second approach
/*
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
}
 */

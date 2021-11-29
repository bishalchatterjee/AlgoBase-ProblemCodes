import java.util.*;
import java.lang.*;
public class question9
{
    static int getMinHeight(int[] arr, int n, int k)
    {
        int min = 0,max=0,res=0;
        Arrays.sort(arr); //sort the array to get suitable array to implement the logic
        res=arr[n-1]-arr[0]; //assign max def from last element to first element

        for(int i=1;i<n;i++){ //since we check previous element for comparison so we start from second element
            if(arr[i]>=k){    //if element is greater than equal to k
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                min=Math.min(arr[i]-k,arr[0]+k);
                res=Math.min(res,max-min);
            }
            else
                continue;
        }
        return res;
    }
        public static void main(String[] args) {
        int arr[] = {6,1,9 ,1, 1 ,7 ,9 ,5 ,2, 10};
        int n = arr.length;
        int k = 4;
        System.out.println(getMinHeight(arr, n, k));
    }
}

//TC-O(n log n)
//SC-O(1)


import java.util.Arrays;

public class question113 {
//Aggressive Cows SPOJ
//using Binary Search
    static void returnLargestMinDiff(int arr[],int n,int cows){
        int low=1,high= arr[n-1]-arr[0];
        int res=0;
        while(low<=high) {
            int mid = (low + high)/2; //Can also be written as mid=(low+high)>>1;
            if (canPlaceCows(arr, n, cows, mid)) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(res);
    }
    static boolean canPlaceCows(int arr[],int n,int cows,int distance){
        int placed_cord=arr[0];
        int count =1;
        for(int  i=1;i<n;i++){
            if(arr[i]-placed_cord>=distance){
                count++;
                placed_cord=arr[i];
            }
        }
        if(count>=cows) return true;
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,1,2,8,4,9};
        int cows=3;
        int n=arr.length;
        Arrays.sort(arr);
        returnLargestMinDiff(arr,n,cows);
    }

}

//T.C - O(n log n)
//S.C - O(1)
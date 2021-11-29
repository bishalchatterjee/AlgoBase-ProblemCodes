public class question26 {
    static int sellAtMaxProfit(int arr[],int n){
        int profit=0;
        for (int i=1;i<n;i++){  //check if a element is greater than the previous element
            if(arr[i]>arr[i-1])
                profit+=arr[i]-arr[i-1];   //subtract the previous element from current element
        }
        return profit;
    }

    public static void main(String[] args) {
//        int arr[]={90, 80, 70, 60, 50};   //output is 0 if the array is already sorted
        int arr[]={100, 30, 15, 10, 8, 25, 80};
        int n= arr.length;
        System.out.println(sellAtMaxProfit(arr,n));
    }
}


//TC-O(n)

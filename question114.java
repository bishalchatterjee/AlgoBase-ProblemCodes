public class question114 {
    //Book allocation problem
    //Binary Search
    public static int minPages(int arr[],int n ,int k){
        int sum=0,mx=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]; //sum of all elements from the array
            mx=Math.max(mx,arr[i]); // max of the elements present in the array
        }
        int low=mx,high=sum,res=0;
        while(low<=high){  // binary search starts
            int mid=(low+high)>>1; //can also be written as (low+high)/2
            if(isFeasible(arr,n,k,mid)) {
                res = mid;
                high = mid - 1; // if feasible then reduce the searching space, new high=mid - 1
            }
            else{
                low=mid+1;
            }
        }
        return  res; //return result
    }
    public static boolean isFeasible(int arr[],int n,int k,int ans ){ //check for possible ans
        int req=1,sum=0;  //req is 1 ,
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return (req<=k);   //if req is less than or equal to no of children
    }

    public static void main(String[] args) {
        int arr[]={15,17,20};
        int n=arr.length;
        int k=2;
        System.out.println(minPages(arr,n,k));
    }
}

//T.C - O(n log(sum+mx))  or O(n log(sum))
//A.S - O(1)
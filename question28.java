import java.util.HashSet;

public class question28 {

    //to find the triplet with given sum
    static boolean findTripletSum(int arr[],int n , int sum){

        for (int i=0;i<n-2;i++){

            int toFind =sum-arr[i];                    // example if given sum is 13   then for i=0, toFind will store 12-1=11
            HashSet<Integer> set = new HashSet<>();        //hashset to search the element that forms triplet else store arr[j]
            for (int j=i+1;j<n;j++){             //runs from i+1 traverses till last
                if(set.contains(toFind-arr[j]))      //example find if 11-arr[1]=11-4=7
                    return true;                    //is present if found in the hashset then arr[i],arr[j],toFind forms triplet with given sum.

                set.add(arr[j]);     //if Hashset doesn't contains toFind-arr[j] then add arr[j] to the Hashset
            }
        }
        return false;          //return false if not found
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1 ,4, 5, 6, 10,8};
        int n= arr.length, sum=13;
        System.out.println(findTripletSum(arr,n,sum));
    }
}


//0(n*n)

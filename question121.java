public class question121 {
    //The double helix SPOJ
    //Using 2 pointer Approach
    public static void findDoubleHelix(int n, int m, int arr1[],int arr2[]) {
        int s1 = 0, s2 = 0;
        int i = 0, j = 0; // initialize i and j
        int sum = 0;
        while (i < n && j < m)  //while i < length of first array && j < length of second array
        {
            //counting sum of consecutive elements until same element(bridge element is found)
            if(arr1[i]<arr2[j])
                s1+=arr1[i++];
            else if(arr2[j]<arr1[i])
                s2+=arr2[j++];
            else{//if same element is found in both array
                sum= sum + Math.max(s1,s2) + arr1[i]; //we add the max of s1/s2 with either of arr1[i] OR arr2[j] because both are same ie the Bridge(common) element.
                s1=s2=0; // we need to reset the sum as mentioned in question
                i++; //increase the pointers values
                j++;
            }
        }
        // add the remaining elements if either of the arrays is exhausted
        while(i<n){
            s1+=arr1[i++];
        }
        while(j<m){
            s2+=arr2[j++];
        }
        //adding the last sum
        sum = sum + Math.max(s1,s2);
        System.out.println(sum); //displaying final output
    }

    public static void main(String[] args) {
//        int arr1[]={3,5,7,9,20,25,30,40,55,56,57,60,62};
//        int arr2[]={1,4,7,11,14,25,44,47,55,57,100};
//        int n=13,m=11;
        int arr1[]={-5,100,1000,1005};
        int arr2[]={-12,1000,1001};
        int n=4,m=3;
        findDoubleHelix(n,m,arr1,arr2);
    }

}

//T.C-O(m+n)
//S.C-O(1)

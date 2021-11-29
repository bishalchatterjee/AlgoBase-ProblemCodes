public class question10 {
    static int minJumps(int arr[]) {
        if (arr.length<=1)   //if length is 1 or 0
            return 0;

        if (arr[0]==0)  //if the first index itself is zero then we cant proceed further
            return -1;

        //initialize
        int maxReach=arr[0];
        int step=arr[0];
        int jump=1;

        // we start traversing from second element
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1)
                return jump;

            maxReach=Math.max(maxReach,i+arr[i]);
            step--;

            //if step == 0
            if(step == 0)
            {
                jump++;

                if(i>=arr.length-1)
                    return -1;

                //reinitialize step
                step=maxReach-i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9,2,6,7,6,8,9};
        System.out.println(minJumps(arr));
    }
}

//TC-O(n)
//SC-O(1)

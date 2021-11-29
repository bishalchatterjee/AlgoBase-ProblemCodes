public class question33 {
    //minimum swaps and k together

    static int minSwapsKTogether(int arr[], int n, int k) {
        //make a window of elements that are less than or equal to k
        //used sliding window
        int fav = 0, nonFav = 0;  //fav means less than equal to k and unFev means greater than k
        for (int i = 0; i < n; i++) { //here er get the window size  ie count of elements lees than or equal to k
            if (arr[i] <= k)
                fav++;
        }
        for (int i = 0; i < fav; i++) {   //get nonFav elements from the first window of size fav
            if (arr[i] > k) nonFav++;
        }
        int left = 0, right = fav - 1, res = Integer.MAX_VALUE;
        while (right < n) {

            res = Math.min(res, nonFav);//compare min of req and no.of non fav elements that are the in the window
            right++;   //increase the right pointer
            if (right < n && arr[right] > k) nonFav++;//if array[right]> than k then increase the nonFav
            if (left < n && arr[left] > k) nonFav--; //if left is greater than k then decrease the nonFav
            left++; //increment window start
        }
        return (res == Integer.MAX_VALUE) ? 0 : res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 6, 7, 3}; //{2,1,3} are less than wqual to 3 and min swap is relace 6 with 3
        int n = arr.length;
        int k = 3;

        System.out.println(minSwapsKTogether(arr,n,k));
    }
}

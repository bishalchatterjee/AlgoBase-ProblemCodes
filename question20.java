public class question20 {

     static void rotate(int arr[], int start, int end) {
        int temp = arr[end];
        for (int i = end - 1; i >= start; i--) {
            arr[i + 1] = arr[i];
        }
        arr[start] = temp;
    }

    static int[] rearrange(int arr[], int n) {
        int i = 0, j = 0, k = 0;                       //i keeps track of negative numbers
                                                      //j keeps track of positive numbers
                                                    //k keeps track of number of traversals
        while (k < n && i < n && j < n) {
            if (k % 2 == 0) {                     //at even k (ie index) there should be negative number and at odd k(ie index) there should be positive number
                if (arr[k] >= 0) {
                    i = k;                   //i and j comes to same index as of k
                    j = k;
                    while (i < n && arr[i] >= 0) i++;
                    if (i >= n) break;
                    else rotate(arr, j, i);       //cant swap because the code needs to be in-place , so we rotate the array
                }
            } else {
                if (arr[k] < 0) {
                    i = k;
                    j = k;
                    while (j < n && arr[j] < 0) j++;
                    if (j >= n) break;
                    else rotate(arr, i, j);
                }
            }
            k++;         // next iteration
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};
        rearrange(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


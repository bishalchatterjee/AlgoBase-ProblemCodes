import java.util.Arrays;

public class question3 {
        static void kthSmallest(int arr[], int k)
        {
            Arrays.sort(arr);
//            int c=arr[k-1];
            System.out.print(arr[k-1]);

        }
        public static void main(String[] args)
        {

            int arr[]={7,10,4,3,20,15};
            int k=4;

            kthSmallest(arr,k);
        }
    }

    //TC-O(n log n) (forquick sort)



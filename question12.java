public class question12 {
    //merge two sorted array without extra space
    static void mergeWithoutExtraSpace(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i]+" ");
                i++;
            } else {
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(arr1[i]+" ");
            i++;
        }
        while (j < n) {
            System.out.print(arr2[j]+" ");
            j++;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}, arr2[] = {6, 7, 8, 9, 10};
        int m = arr1.length, n = arr2.length;
        mergeWithoutExtraSpace(arr1, arr2, m, n);
    }
}


//TC-O(m+n)
//SC-O(1)




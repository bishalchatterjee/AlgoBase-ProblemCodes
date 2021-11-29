public class question1 {
    static void reverseArr(int arr[]) {
        int length = arr.length;
        int start = 0, end = length - 1;
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printReverseArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverseArr(arr);
        printReverseArr(arr);
    }
}


//TC-O(n)
//SC-O(1)

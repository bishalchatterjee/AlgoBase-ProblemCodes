public class question2 {
    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[]) {
        Pair minMax = new Pair(); //creating minMax object
        int n = arr.length;

        //for only one element
        if (n == 1) {
            minMax.min = arr[0];
            minMax.max = arr[0];
        }

        //for more element
        if (arr[0] > arr[1]) {
            minMax.min = arr[1];
            minMax.max = arr[0];
        } else {
            minMax.min = arr[0];
            minMax.max = arr[1];
        }
        for (int i = 2; i < arr.length; i++) { //traversing form the third element
            if (arr[i] < minMax.min)
                minMax.min = arr[i];
            else if (arr[i] > minMax.max)
                minMax.max = arr[i];
        }

        return minMax;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Pair minMax = getMinMax(arr);
        System.out.println("Minimum Element is " + minMax.min);
        System.out.println("Maximum Element is " + minMax.max);
    }
}

//TC-O(n)







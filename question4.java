public class question4 {
    static void mySort(int arr[]) {
        int n = arr.length;
        int j = 0;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                newArr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+" ");
            }
        }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 1, 0, 2, 2, 0, 1};
        mySort(arr);
    }
}

/*EFFECTIVE SOL (only one traversal)
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args)
    {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};

        int n = arr.length;

        sort(arr,n);

	    for(int x:arr)
            System.out.print(x+" ");

    }

    static void sort(int arr[],int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;

                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swapping arr[h] & arr[mid])
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;

                    h--;
                    break;
            }
        }

    }
}

 */






//IP-{1,0,2,1,0,2,2,0,1}
//OP- {0,0,0,1,1,1,2,2,2}
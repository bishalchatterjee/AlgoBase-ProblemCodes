public class question32 {
    //three way partitioning of an array

    //2 pointers approach
    static void threeWayPartition(int arr[],int a, int b){
        int left=0;
        int right= arr.length-1;

        for (int i = 0; i <= right ; i++) {       //until we cross right pointer

            if(arr[i]<a){              // if arr[i]smaller than a
                swap(arr,left,i);       //swap left with i
                left++;                  // increase the pointer index

            }else if(arr[i]>b){          //if arr[i] greater than b
                swap(arr,right,i);       //swap
                right--;                //reduce right pointer
                i--;                   //also reduce i to check if the element that got swapped is less than a,because we don't know if that element id greater or smaller than a or b
            }
        }
    }
    static void swap(int arr[],int left, int right){              //swap function
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;


    }

    public static void main(String[] args) {
        int[] arr={10, 9, 3,5,5,2, 1};
        int a=5,b=5;                           //elements left to a  should be less than a , elements on right of b should be greater than b
        threeWayPartition(arr,a,b);
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}

//TC-O(n)
//SC-O(1)

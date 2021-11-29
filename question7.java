public class question7 {
    static void rotateByOne(int arr[]){
        int n=arr.length;
        int temp=arr[n-1]; //last element
        for(int i=n-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotateByOne(arr);

    }
}

//TC-O(n)
/*
IP-12345
OP-51234
 */
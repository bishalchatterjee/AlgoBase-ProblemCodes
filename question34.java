public class question34 {

    //minimum operations to make array palindrome

    static int palindromeArrayCheck(int arr[],int n){
        int flag=1;

        for (int i = 0; i <n ; i++) {
            int rem=0,rev=0;
            int x=arr[i];
            while(x>0){
                rem=x%10;
                rev=rev*10+rem;
                x=x/10;
            }
            if(arr[i]!=rev){
                flag=0;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[]={111,222,333,445};
        int n=arr.length;
        System.out.println(palindromeArrayCheck(arr,n));
    }
}

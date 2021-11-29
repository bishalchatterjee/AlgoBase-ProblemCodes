public class question445{
    //copy set bits in a given range ( we need to copy the 1s in range  in 'a' and change those 0s to 1s in the same range of b)

    static int copySetBitsInGivenRange(int a,int b,int left, int right){
        int mask=(1 << (right-left +1));
        mask--;
        mask=(mask <<(left -1));
        mask=(mask & a);
        b= b| mask;

     return b;
    }

    public static void main(String[] args) {
       int  a = 10, b = 13, left = 2, right = 3;


        System.out.println(copySetBitsInGivenRange(a,b,left,right));

    }
}


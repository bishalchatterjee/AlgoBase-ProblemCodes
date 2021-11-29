public class question443 {
    //power set of two
    //using Brian kerningam's algo
    public static boolean isPowerofTwo(long n)
    {
        if(n == 0)            // 0 is not a power of two
            return false;

        return ((n & (n - 1)) == 0);        //if a number is a power of two it will have only one set bits
    }

    public static void main (String[] args) {

        int n = 1;
        System.out.println(isPowerofTwo(n));
    }
}

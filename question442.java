public class question442 {
    //(1 << x) means 2^x
    //count total set bits from 1 to n
    public static int countSetBits(int n) {
        if (n == 0) //return 0 because there are no set bits in binary of 0
            return 0;
        int x =largestPowerOf2inGivenRange(n); //get the set bit counts of number before the largest  power of 2
         int bitTill2toThePowX= x* (1<<(x-1)); //suppose the n=20; this will give set bit counts till 2^4-1 ie from 0 to 15
        //now we are left two calculate form 16 to 20 ie(20-16)+1 =5
        int mostSignificantBitsToN=n-(1<<x)+1;//this gives n-(2^x)+1= 20 - 2^4+1= 20-15 =5
        int rest=n-(1<<x);// since the 5 numbers after calculation of mostSignificantBitsToN the number gets reduced to new numbers
        int finalN=countSetBits(rest);//so we recursively call for the rest
        int ans = bitTill2toThePowX + mostSignificantBitsToN + finalN;  //add all the bits finally
        return ans;

    }
    static int largestPowerOf2inGivenRange(int n){ // returns largest possible power of 2 till given n
        int x=0;
        while((1 << x)<=n)   //eg if n= 20, 2^0=1<=20? yes --> x++; next 2^1=2<=20? yes ....2^4=16<=20
            x++;             // 5 (from o to 4)

        return x-1;   //5-1 =4
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(countSetBits(n));
    }

}
//TC-O(log N)
//SC-O(1)


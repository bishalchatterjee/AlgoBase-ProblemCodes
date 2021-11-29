public class question439 {

    //Bit Manipulation
    //Count set bits in an Integer N
    //Brian Kerningam's algo
    static int countBits(int N){
        int res=0; //initialize result
        while(N>0){
            N=N&(N-1); //binary value of 5 is 0...0101(29 0's if 32bit or 61 0's if 64bit representation )
                       //binary value of 4 is 0...0100
                       // it does & until all set bits are converted to 0
            res++;   //counts the set bit because its going to get removed by & operation
        }
        return res;
    }

    public static void main(String[] args) {
        int N=5;
        System.out.println(countBits(N));
    }
}

//TC-O(no.of set bits in N)

public class question444 {

    //Find position of set bit(there must be only one set bit)
   static int findPosition(int n){

       if(n==0)return -1;  //if number is 0 return -1
       if((n & (n-1))==0){
           int result = (int)(Math.log(n) / Math.log(2))+1; //converting to log2n +1
           return result;
       }
       return -1;  //return -1 if set bit is more than one(eg-> 2 -->010 there is only one set bit at 2
                  //                                            5 -->101  so there are more than one set bit
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(findPosition(n));
    }
}

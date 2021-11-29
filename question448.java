public class question448 {
    //Power set using bitwise
   //prints all subset of given string

    static void printPowerSet(String s){
        int n=s.length();
        int pow=(int)Math.pow(2,n);
        for (int counter=0;counter<pow;counter++){  //each counter contains binary representation from 0 to pow
            
            for(int i=0;i<n;i++){
                if((counter&(1<<i))!=0) //when we left shift by 1 we get for eg if i=2 (1<<2)=4{basically multiplies by 2
                    System.out.print(s.charAt(i));//if the first bit set is found (1 is found ) print the character
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        String s = "abc";

        printPowerSet(s);
    }
}


//TC-O(2^n * n)
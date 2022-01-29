import java.util.ArrayList;
import java.util.List;

public class question78 {
    //To generate all possible IP address from a given string
     public static List<String> restoreIpAddresses(String s){
        List<String> ans=new ArrayList<>(); //creating an arrayList
        helper(s,0,0,"",ans);// initial values for helper function
        return ans; //returning arraylist with all possible IP addresses
    }
    public static void helper(String s,int i , int par, String ans,List<String> res){
         if(i==s.length() || par==4){  //IP address can have only 4 partitions
             if(s.length()==i && par==4){
                 res.add(ans.substring(0,ans.length()-1)); //removes the last "." added to the generated arraylist containing IPs
             }
             return;
         }
         helper(s,i+1,par+1,ans+s.charAt(i)+".",res); // call from i+1 is valid
         if(i+2<=s.length() && isvalid(s.substring(i,i+2)))  // call from next i+2 is valid
             helper(s,i+2,par+1,ans+s.substring(i,i+2)+".",res);
         if(i+3<=s.length() && isvalid(s.substring(i,i+3))) //  call from next i+3 is valid but call from i+4 is invalid because the generated partition cannot have 4 characters( 0 - 255)
        helper(s,i+3,par+1,ans+s.substring(i,i+3)+".",res);
    }
    public static boolean isvalid(String str) { // returns if the sting is valid to be a IP or not
         if(str.charAt(0)=='0'){ //should not start with 0
             return false;
         }
         int val=Integer.parseInt(str); //checks for valid IP range ie 0-255
         return val<=255; //returns false if it's out of range
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135").toString());
//        System.out.println(restoreIpAddresses("0000").toString());
    }
}

//T.C- O(4n) or O(n) //where n is the no of characters in the given string

import java.util.HashSet;

public class question27 {
    //to find if array is a subset of another array
static String isSubset(long[] a1, long[] a2, long n ,long m){
    HashSet<Long>set =new HashSet<Long>();
    for(int i=0;i<n;i++){
        set.add(a1[i]);
    }

    for(int j=0;j<m;j++){
        if(!set.contains(a2[j])) return  "No";
    }
    return "Yes";
}

    public static void main(String[] args) {
        long a1[]={1, 2, 3, 4, 5, 6};
        long a2[]={1,2,4 };
        long n= a1.length;
        long m= a2.length;
        System.out.println(isSubset(a1,a2,n,m));
    }
}

//O(n+m)

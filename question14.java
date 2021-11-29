import java.util.*;
import java.lang.*;

class Interval implements Comparable<Interval> // to implement interface Comparable
{
    int start, end;

    Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Interval a)  //custom compare to function of comparable class
    { return this.start - a.start; }
};

public class question14
{
    static void mergeIntervals(Interval arr[], int n)
    {
        Arrays.sort(arr);

        int res = 0;//to keep track of merged interal indexes

        for (int i=1; i<n; i++)
        {
            if (arr[res].end >=  arr[i].start)
            {
                arr[res].end = Math.max(arr[res].end, arr[i].end);// max of end of interval of i and res
                arr[res].start = Math.min(arr[res].start, arr[i].start);//min of start of interval of i and res
            }
            else {/*if array[res].end becomes less then there is no chance of mergeInterval
                so copy same start and end of arr[i] to arr[res]*/
                res++;
                arr[res] = arr[i];
            }
        }

        for (int i = 0; i <= res; i++)
            System.out.print(  "[" + arr[i].start + ", " + arr[i].end + "] ");
    }

    public static void main (String[] args)
    {
        Interval arr[] = { new Interval(5,10),new Interval(3,15),new Interval(18,30),
                new Interval(2,7) };  //(x,y) ---> x=start,y=end

        int n = arr.length;

        mergeIntervals(arr, n);
    }
}

//TC-O(n log n)
//SC-O(1)

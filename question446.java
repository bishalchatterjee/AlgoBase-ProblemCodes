public class question446 {
/*Java implementation to Divide two
integers without using multiplication,
division and mod operator*/

    // Function to divide a by b and
    // return floor value it
    static int divide(int dividend, int divisor) {

        // Calculate sign of divisor i.e.,
        // sign will be negative only if
        // either one of them is negative
        // otherwise it will be positive
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

        // Update both divisor and
        // dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize the quotient
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
        //if the sign value computed earlier is -1 then negate the value of quotient
        if (sign == -1) quotient = -quotient;

        return quotient;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(divide(a, b));

        a = 43;
        b = -8;

        System.out.println(divide(a, b));
    }
}


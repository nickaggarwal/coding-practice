package com.company;

public class DivideTwoNumber {

    public static void main(String[] args) {
        // write your code here
        int a = 500;
        int b = 10  ;
        System.out.println(getQuitoent(a, b));
    }

    public static int getQuitoent(int divident, int divisor ) {

        if(divisor==0) return Integer.MAX_VALUE;
        if(divisor==-1 && divident == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        int sign = ((divident < 0) ^ (divisor < 0)) ? -1 : 1;

        // remove sign of operands
        long pdivident = Math.abs((long)divident);
        long pdivisor = Math.abs((long)divisor);
        int quotient = 0;
        long temp = 0;

        for( int i = 31 ; i >=0  ; i-- )
        {
            if( pdivisor<<i <= pdivident )
            {
                pdivident -= pdivisor<<i ;
                quotient |= 1L<<i ;
            }
        }
        return quotient*sign ;
    }

}

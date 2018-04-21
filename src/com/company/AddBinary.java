package com.company;

public class AddBinary {

    public static void main(String args[])
    {
        long x= Math.round(2.5);
        String a = "1010", b ="1011" ;
        StringBuilder stra = new StringBuilder(a);
        a = stra.reverse().toString();
        stra = new StringBuilder(b);
        b = stra.reverse().toString();
        int z=0, carry = 0 ;
        String result = "" ;
        while( z<a.length() && z<b.length() )
        {
            int temp = carry + Character.getNumericValue(a.charAt(z)) + Character.getNumericValue(b.charAt(z)) ;
            if(temp/2 == 1 )
                carry=1 ;
            else
                carry=0 ;
            result += temp%2 ;
            z++ ;
        }

        while(  z < a.length() )
        {
            int temp = carry + Character.getNumericValue(a.charAt(z));
            if(temp/2 == 1 )
                carry=1 ;
            else
                carry=0 ;
            result += temp%2 ;
            z++ ;
        }
        while (  z < b.length() )
        {
            int temp = carry + Character.getNumericValue(b.charAt(z));
            if(temp/2 == 1 )
                carry=1 ;
            else
                carry=0 ;
            result += temp%2 ;
            z++ ;
        }
        if(carry == 1)
            result += "1" ;
        StringBuilder str = new StringBuilder(result);
        System.out.println(str.reverse().toString());
    }
}

package com.company;

public class RepeatedStringMAtch {
    public static void main(String[] args) {
        // write your code here
    }

    public int repeatedStringMatch(String A, String B) {
        String newA = A ;
        int i = 1;
        while (newA.length()< (B.length() + 2*A.length())){
            if(newA.indexOf(B) != -1){
                return i ;
            }
            else {
                newA += A;
                i++;
            }
        }
        return -1;
    }

}

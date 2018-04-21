package com.company;

public class MinimunWindowString {

    public static void main(String[] args) {
        // write your code here

        String s= "abcdebdde", t="bde";
        System.out.println(minWindow(s, t));

    }

    public static String minWindow(String S, String T) {

        int len_str = S .length();
        int len_pat = T.length();

        int[] hash_str = new int[256] ;
        int[] hash_pat = new int[256] ;

        for(int i=0 ; i <len_pat ; i++ ){
            hash_pat[T.charAt(i)]++ ;
        }

        int start_index =-1 , start = 0 , min_length = Integer.MAX_VALUE ;
        int count = 0;

        for(int i=0 ; i < len_str ; i++ )
        {
            hash_str[S.charAt(i)]++ ;

            if(hash_pat[S.charAt(i)] != 0 && hash_pat[S.charAt(i)] >= hash_str[S.charAt(i)])
                count++;

            if(count == len_pat) {

                while( hash_str[S.charAt(start)] > hash_pat[S.charAt(start)] ||  hash_pat[S.charAt(start)] == 0)
                {
                    if (hash_str[S.charAt(start)] > hash_pat[S.charAt(start)]) {
                        hash_str[S.charAt(start)]--;
                    }
                    start++;
                }

                int len_window = i - start + 1;
                if( len_window <  min_length)
                {
                    start_index = start ;
                    min_length = len_window;
                }

            }
        }
        if (start_index == -1)
        {
            return "";
        }

        return S.substring(start_index, start_index+min_length);
    }
}

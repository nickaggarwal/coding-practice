package com.company;

public class AddBoldTag {

    public static void main(String args[])
    {}

    public String addBoldTag(String s, String[] dict) {
        boolean[] bold = new boolean[s.length()];
        int end  = 0 ;
        for(int i=0; i < s.length(); i++){
            for(String word : dict){
                if(s.startsWith(word,i)){
                    end = Math.max(end, i+ word.length());
                }
            }
            bold[i] = end > i ;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!bold[i]) {
                result.append(s.charAt(i));
                continue;
            }
            int j = i;
            while (j < s.length() && bold[j]) j++;
            result.append("<b>" + s.substring(i, j) + "</b>");
            i = j - 1;
        }

        return result.toString();

    }

}

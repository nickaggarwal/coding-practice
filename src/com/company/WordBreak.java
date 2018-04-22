package com.company;

import java.util.List;

public class WordBreak {

    public static void main(String[] args) {


    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() == 0 )
            return true;
        boolean[] t = new boolean[s.length()+1];
        t[0] = true ;
        for(int i =1; i <= s.length(); i++){
            if(!t[i] && wordDict.contains(s.substring(0, i)))
                t[i]= true;
            if(t[i]){
                if(i==s.length())
                    return true;
                for(int j=i+1; j<= s.length();j++){
                    if (!t[j] && wordDict.contains(s.substring(i, j))) {
                        t[j] = true;
                    }
                    if (j == s.length() && t[j]) {
                        return true;
                    }
                }
            }
        }
        return t[s.length()];
    }
}

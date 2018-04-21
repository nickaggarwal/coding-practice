package com.company;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    static Map<Character, String> numToString ;

    public static void main(String[] args) {
        // write your code here

        String input = "23";
        List<String> result = letterCombinations(input);
        for(String let : result){
            System.out.println(let);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();

        numToString = new HashMap<>();
        numToString.put('2', "abc");
        numToString.put('3', "def");
        numToString.put('4', "ghi");
        numToString.put('5', "jkl");
        numToString.put('6', "mno");
        numToString.put('7', "pqrs");
        numToString.put('8', "tuv");
        numToString.put('9', "wxyz");

        CombinationUtils( digits, results, 0 , "");
        return results;
    }


    public static void CombinationUtils(String digits, List<String> results, int pos, String temp){

        if( pos == digits.length()) {
            results.add(temp);
            return;
        }

        String chars = numToString.get(digits.charAt(pos)) ;
        for(int i=0; i < chars.length() ; i++ ){
            String soFar = temp + chars.charAt(i) ;
            CombinationUtils(digits, results, pos+1, soFar);
        }
    }

}

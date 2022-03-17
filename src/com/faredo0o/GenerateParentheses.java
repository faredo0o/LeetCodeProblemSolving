package com.faredo0o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    public static void main(String[] args) {

        System.out.println(generateParentheses(3));
    }
    public static List<String> generateParentheses(int n) {
        List<String> solutionList = new ArrayList<>();
        if(n<=0){
            return solutionList;
        }
        String left="(";
        String right=")";
        String full="()";
        String combination="";
        for(int i=0;i<n;i++){
            left+=left;
            right+=right;
        }
        full=left+full+right;
        solutionList.add(full);
        return solutionList;
    }
}
// 123456
// ((()))
// (()())
// (())()
// ()(())
// ()()()
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
       List<String> solution=new ArrayList<>();

       generate(solution,"",0,0,n);
       return solution;
    }
    public static void generate(List<String> solution,String current,int open,int close,int n){
        if(current.length()==n*2) {
            solution.add(current);

            return;
        }
        if(open<n){

            generate(solution,current+"(",open+1,close,n);
        }
        if(close<open){

            generate(solution,current+")",open,close+1,n);
        }
    }
}
// 123456
// ((()))
// (()())
// (())()
// ()(())
// ()()()
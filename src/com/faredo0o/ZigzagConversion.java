package com.faredo0o;

import com.sun.source.tree.BreakTree;
import org.w3c.dom.Node;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class ZigzagConversion {
    public static void main(String[] args) {


        System.out.println(convert("PAYPALISHIRING",3));
    }
    public static String convert(String s, int numRows) {

        if(numRows==1) return s;
        int dir=-1;
        String solution="";
        String[] result=new String[numRows];
        Arrays.fill(result,"");
        int row=0;
       for(char c :s.toCharArray()){
           result[row]+=c;
           if(row==0||row==numRows-1) dir*=-1;
           row+=dir;

      }

       for(String sub:result){
           solution+=sub;
       }
        return solution;

    }


}
/*
0   4   8    12
1 3 5 7 9 11 13
2   6   10
 */

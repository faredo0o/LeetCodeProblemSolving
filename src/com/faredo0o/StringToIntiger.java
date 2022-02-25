package com.faredo0o;

import java.util.*;

public class StringToIntiger {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
        System.out.println(myAtoi("  +  413"));
    }
    public static int myAtoi(String s) {
        long digits=0;
        s=s.strip();
        Map<Character,Integer> digitsList=new HashMap();
        digitsList.put('0',0);
        digitsList.put('1',1);
        digitsList.put('2',2);
        digitsList.put('3',3);
        digitsList.put('4',4);
        digitsList.put('5',5);
        digitsList.put('6',6);
        digitsList.put('7',7);
        digitsList.put('8',8);
        digitsList.put('9',9);

        int sign =1;
        if(!s.isEmpty()&&s.charAt(0)=='-'){
            sign=-1;
            s=s.substring(1);
        }else if(!s.isEmpty()&&s.charAt(0)=='+'){

            s=s.substring(1);
        }

        for(char c:s.toCharArray()) {


            if (digitsList.containsKey(c)) {


                digits *= 10;
                digits += digitsList.get(c);
                if (sign == 1 &&(digits*sign) >= Integer.MAX_VALUE){
                    digits = Integer.MAX_VALUE;
                    break;
                } else if (sign == -1 &&(digits*sign) <=Integer.MIN_VALUE) {
                    digits = Integer.MIN_VALUE;
                    break;
                }


            }else{
                break;
            }

        }
        return (int)digits*sign;
    }
}

package com.faredo0o;


public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x){
     long result=0;
     int digit=0;
     boolean negative=false;
     if(x<0){
         x*=-1;
         negative=true;

     }
     while(x>=1){
           result=result*10;
         digit=x%10;
         result=result+digit;
         x=x-digit;
         x=x/10;
     }
     if(negative){
         result*=-1;
     }
     if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}

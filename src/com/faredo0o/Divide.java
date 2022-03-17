package com.faredo0o;

public class Divide {
    public static void main(String[] args) {
        //1067541020
        //-2147483648
        System.out.println( divide(1000 ,2));
    }
    public static int  divide(int dividend,int divisor){
      int counter=0;


      boolean isSignChanged=false;

      if(dividend==divisor) return 1;
        if(dividend==Integer.MIN_VALUE){
            if(divisor==-1){
                return Integer.MAX_VALUE;
            }
            if(divisor==1){
                return Integer.MIN_VALUE;
            }

        }
        if(divisor==Integer.MIN_VALUE) {
            return 0;
        }

       else if(divisor==1){
          return dividend;
      }
      if(dividend<0&&divisor>0) {
          divisor=-divisor;
          isSignChanged = true;
      }
      else if(dividend>0&&divisor<0){
          divisor=-divisor;
          isSignChanged= true;
      }

       long temp=divisor;

      if(dividend>0){

          while(dividend>=temp){
              temp+=divisor;
              counter++;
          }
      }else {

          while (dividend <= temp) {
              temp += divisor;
              counter++;
          }
      }
      if(isSignChanged) return -counter;
      return counter;
    }
}
//-2147483648 0 2147483647
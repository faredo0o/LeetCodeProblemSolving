package com.faredo0o;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    public static void main(String[] args) {

        System.out.println(intToRoman(20));
    }
    public static String intToRoman (int num){
        Map<Integer,String> numbers=new HashMap<>();
        StringBuilder builder=new StringBuilder();
        int pos=1;
        numbers.put(1,"I");
        numbers.put(5,"V");
        numbers.put(10,"X");
        numbers.put(50,"L");
        numbers.put(100,"C");
        numbers.put(500,"D");
        numbers.put(1000,"M");
        numbers.put(4,"IV");
        numbers.put(9,"IX");
        numbers.put(40,"XL");
        numbers.put(90,"XC");
        numbers.put(400,"CD");
        numbers.put(900,"CM");
        while(num>=1){
            int mod=num%10;
            num=num/10;
            if(numbers.containsKey(mod)){

                builder.insert(0,numbers.get(mod*pos));
            }
            else if(mod==2||mod==3){
                for(int i=1;i<=mod;i++){
                    builder.insert(0,numbers.get(pos));
                }
            }
            else if(mod==6||mod==7||mod==8){

                for(int i=1;i<=mod%5;i++){
                    builder.insert(0,numbers.get(1));
                }
                builder.insert(0,numbers.get(5));

            }
            pos*=10;

        }
        return builder.toString();
    }
}

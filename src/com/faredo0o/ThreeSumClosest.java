package com.faredo0o;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] numbers1={1,2,4,8,16,32,64,128};
        int[] numbers2={-1,0,1,1,55};

        System.out.println(threeSumClosest(numbers1,82));
        System.out.println(threeSumClosest(numbers2,3));
    }
    public static int threeSumClosest(int [] nums,int target){

        Arrays.sort(nums);
        int sol=0;
        int sum;

        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){

            int min=i+1;
            int max=nums.length-1;

            while(min<max){

                 sum=nums[i]+nums[min]+nums[max];
                 if(result>Math.abs(target-sum)){
                     result=Math.abs(target-sum);
                     sol=sum;
                 }

                if(sum==target) {

                  return sum;

                }else if(sum<target) {
                    min++;
                    // continue;
                }else {

                    max--;
                    // continue;
                }

            }
        }
        return sol;

      }

}

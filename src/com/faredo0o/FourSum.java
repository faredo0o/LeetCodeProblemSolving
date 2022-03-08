package com.faredo0o;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {

        int[] nums={1,0,-1,0,-2,2};
        int[] nums1={-2,-1,-1,1,1,2,2};
        System.out.println(fourSum(nums1,0));
    }

    public static List<List<Integer>> fourSum(int[] nums,int target) {

        List<List<Integer>> resultList=new ArrayList<>();
        if(nums.length<4) return resultList;
        Arrays.sort(nums);
        int sol=0;
        int sum;

        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int min=j+1;
                int max=nums.length-1;

                while(min<max){

                    sum=nums[i]+nums[min]+nums[max]+nums[j];


                    if(sum==target) {

                       List<Integer> temp=new ArrayList<>();
                       temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[min]);
                        temp.add(nums[max]);
                        resultList.add(temp);
                        while(min<max&&nums[min]==nums[min+1]) min++;
                        while(min<max&&nums[max]==nums[max-1]) max--;
                        min++;
                        max--;

                    }else if(sum<target) {
                        min++;
                        // continue;
                    }else {

                        max--;
                        // continue;
                    }

                }
            }

        }

        return resultList;
    }
}
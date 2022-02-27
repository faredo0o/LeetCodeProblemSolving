package com.faredo0o;

import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args) {


        int[] numbers2={3,0,-2,-1,1,2};
        System.out.println(threeSum(numbers2));

    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> resultList=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//                    int sum=nums[i]+nums[j]+nums[k];
//                    if(sum==0){
//                        List<Integer> sol=new ArrayList();
//                        sol.add(nums[i]);
//                        sol.add(nums[j]);
//                        sol.add(nums[k]);
//
//                        Collections.sort(sol);
//                        if(!resultList.contains(sol)) {
//                            resultList.add(sol);
//                        }
//                    }
//                }
//            }
//        }
//
//
//     return resultList;
//    }
public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {

        int max = nums.length - 1;
        int min = i + 1;
        int target = -nums[i];
        while (min < max) {
            if (target == nums[min] + nums[max]) {

                List sol = new ArrayList();
                sol.add(nums[i]);
                sol.add(nums[min]);
                sol.add(nums[max]);

                    resultList.add(sol);
                    while(min<max&&nums[min]==nums[min+1]) min++;
                    while(min<max&&nums[max]==nums[max-1]) max--;

                min++;
                max--;
            }else if(nums[min]+nums[max]>target){
                max--;
            }else{
                min++;
            }

        }

    }
    return resultList;

}

}

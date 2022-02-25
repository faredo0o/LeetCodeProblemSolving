package com.faredo0o;

public class ContainerWithMostWater {
    public static void main(String[] args) {


    }
    public int maxArea(int[] height) {
        int maxArea=0;
        for(int i=0;i<height.length;i++){
            if(height[0]>0){

                for(int j=maxArea/height[i];j<height.length;j++){
                    int waterHeight=height[i]<height[j]? height[i]:height[j];
                    int currentArea=waterHeight*(j-i);

                    maxArea=currentArea>maxArea? currentArea:maxArea;
                }
            }

        }
        return maxArea;
    }
}


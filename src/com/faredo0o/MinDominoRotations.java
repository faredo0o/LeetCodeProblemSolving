package com.faredo0o;

public class MinDominoRotations {
    public static void main(String[] args) {

    }
    public int minDominoRotations(int[] tops, int[] bottoms) {

        boolean resultFound=false;
        int result=tops.length;
        if(tops.equals(bottoms)) return 0;
        for(int i=1;i<=6;i++){
            int alike=0;
            int topsCount=0;
            int bottomsCount=0;
            for(int j=0;j<tops.length;j++){
                if(tops[j]==i) topsCount++;
                if(bottoms[j]==i) bottomsCount++;
                if(tops[j]==bottoms[j]) alike++;

            }
            if(topsCount+bottomsCount-alike==tops.length){
                resultFound=true;
                result=Integer.min(tops.length-Integer.max(topsCount,bottomsCount),result);
            }
        }
        if(resultFound)return result;
        return -1;

    }
}

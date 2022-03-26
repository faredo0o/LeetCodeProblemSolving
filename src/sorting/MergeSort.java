package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] numbers={8,5,7,6,1,4,7,2,0,3,9};
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    //O(n log n)
    public static void mergeSort(int[] numbers){
        int length=numbers.length;
        if(length<2) return;
        int midIndex=length/2;
        int[] leftHalf=new int[midIndex];
        int[] rightHalf=new int[length-midIndex];
        for(int i=0;i<midIndex;i++){
            leftHalf[i]=numbers[i];
        }
        for(int i=midIndex;i<length;i++){
            rightHalf[i-midIndex]=numbers[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(numbers,leftHalf,rightHalf);
    }
    public static void merge(int[] numbers,int[] leftHalf,int[] rightHalf){
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int i=0,j=0,k=0;
        while(i<leftSize&&j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                numbers[k]=leftHalf[i];
                i++;
            }else{
                numbers[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            numbers[k]=leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            numbers[k]=rightHalf[j];
            j++;
            k++;
        }
    }

}

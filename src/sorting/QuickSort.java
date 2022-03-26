package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers={8,5,7,6,1,4,7,2,0,3,9};
        quickSort(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));

    }
    public static void quickSort(int[] numbers,int lowIndex,int highIndex){
       if(lowIndex>=highIndex) return ;
        int pivot=numbers[highIndex];
        int leftPointer=lowIndex;
        int rightPointer=highIndex;
        while(leftPointer<rightPointer){
            while (numbers[leftPointer]<=pivot&&leftPointer<rightPointer){
                leftPointer++;
            }
            while(numbers[rightPointer]>=pivot&&leftPointer<rightPointer){
                rightPointer--;
            }
            swapArray(numbers,leftPointer,rightPointer);
        }
        swapArray(numbers,leftPointer,highIndex);
        quickSort(numbers,lowIndex,leftPointer-1);
        quickSort(numbers,leftPointer+1,highIndex);


    }
    public static  void swapArray(int[] array,int leftPointer,int rightPointer){
        int temp=array[leftPointer];
        array[leftPointer]=array[rightPointer];
        array[rightPointer]=temp;
    }
}

package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers={8,5,7,6,1,4,7,2,0,3,9};
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    // O(n^2)
   public static int[] bubbleSort(int[] numbers){
        for(int i=0;i<numbers.length;i++){

            boolean isSorted=true;
            for(int j=0;j<numbers.length-1-i;j++) {
             if (numbers[j] > numbers[j + 1]) {
                 int temp = numbers[j];
                 numbers[j] = numbers[j + 1];
                 numbers[j + 1] = temp;
                 isSorted=false;
             }

         }
         if(isSorted) return numbers;

        }
        return numbers;
    }
}

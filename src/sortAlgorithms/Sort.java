package sortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {



    private int [] bubleSort(int[] arrayToSort){
        int arrLength = arrayToSort.length;
        for(int i = 0; i<arrLength-1; i++){
            for(int j = 0; j<arrLength-1 -i; j++){
                if(arrayToSort[j]> arrayToSort[j+1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }
        return arrayToSort;
    }


    private int[] selectionSort(int[] arrayToSort){
        int arrlen = arrayToSort.length;
        for(int i = 0; i<arrlen-1;i++){
            int minIndex = i;
            for(int j = i+1; j<arrlen; j++){
                if(arrayToSort[j]< arrayToSort[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[minIndex];
            arrayToSort[minIndex] = temp;
        }

        return arrayToSort;
    }


    private int[] insertionSort(int[] arrayToSort){
            int arrLen = arrayToSort.length;
            for(int i = 0; i<arrLen;i++){

                for(int j=i; j>0;j--){
                    if(arrayToSort[j]<arrayToSort[j-1]){
                        int temp = arrayToSort[j];
                        arrayToSort[j] = arrayToSort[j-1];
                        arrayToSort[j-1] = temp;
                    }else{
                        break;
                    }
                }
            }
            return arrayToSort;
    }


    public static boolean isPalindromString(String text){
        String reverse = reverse(text).toLowerCase();
        if(text.toLowerCase().equals(reverse)){
            return true;
        }
        return false;
    }



    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()-1) + reverse(input.substring(0,input.length()-1));

    }


    public static boolean isPalindromeNumber(int input){

        int temp =0;
        int r = 0;
        int sum = 0;
        temp = input;
        while (input>0){
            r = input%10;
            sum = (sum*10)+r;
            input = input/10;
        }
        return temp == sum;

    }


    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    




    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr= {1,9,3,7,2,54,80,4,313,520,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort.bubleSort(arr)));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort.selectionSort(arr)));
        System.out.println(Arrays.toString(arr));

        int[] arr2= {1,423,3,7,2,54,21,4,432,13,8};
        System.out.println(Arrays.toString(sort.insertionSort(arr2)));

        System.out.println(reverse("Mohammed"));
        System.out.println(isPalindromeNumber(454));
        System.out.println(fib(9));

    }


}

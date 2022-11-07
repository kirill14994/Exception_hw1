package ExHw1;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr1 = {10, 35};
        int[] arr2 = {12, 23};
        int[] result = diffArr(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] diffArr(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Array can't be null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Arrays length isn't equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i]-arr2[i];
        }
        return arr;
    }
}
package ExHw1;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        double[] arr1 = {15, 35};
        double[] arr2 = {12, -2};
        double[] result = diffArr(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static double[] diffArr(double[] arr1, double[] arr2){
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Array can't be null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Arrays length isn't equal");
        }
        double[] arr = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0 || arr2[i] == 0){
                throw new RuntimeException("value cannot be 0");
            }
            arr[i] = arr1[i]/arr2[i];
        }
        return arr;
    }
}
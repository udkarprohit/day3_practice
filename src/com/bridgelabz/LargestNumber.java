package com.bridgelabz;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,35,5,56,78,9};
        int max = arr[0];
        for (int i = 0;i < arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Largest number : "+max);
    }
}

package com.bridgelabz;

public class SmallestNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{12,2,35,5,56,78,9};
        int min = arr[0];
        for (int i = 0;i < arr.length;i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest Number in an array : " + min);
    }
}

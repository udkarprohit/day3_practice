package com.bridgelabz;

public class OddPosition {
    public static void main(String[] args) {
        int arr[] = {12,2,35,5,56,78,9};
        for (int i = 0;i < arr.length;i++)
        {
            int pos = i;
            if (pos % 2 != 0)
            {
                System.out.print("Index value & element of an array : " + pos);
                pos = arr[i];
                System.out.println(" = " + pos);
            }
        }
    }
}

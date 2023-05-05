/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

/**
 *
 * @author JOWEN
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 7, 8, 0, 9, 11, 19};
        
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selectionSort(int[] arr) {
        
        int n = arr.length - 1;
        for (int i = 0;i < n;i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                // Check if element is less than the currentMinimum
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the 2 positions
            if (minIndex != i) { // Make sure that the user would not swap the same values to itself
                int temp = minIndex;
                arr[i] = arr[minIndex];
                arr[minIndex] = i;
            }
            
            
        }
        
    }
}


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
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {29, 38, 3, 13, 12, 19, 23, 44, 2, 31, 13, 2, 34, 44, 3};
        
        selectionSort(arr);
        
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0;i < n;i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            
            
        }
        
    }
}

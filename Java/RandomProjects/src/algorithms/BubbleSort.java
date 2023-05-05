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
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {1 , 6, 2, 4, 6, 1, 7, 5, 12};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort (int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    
}

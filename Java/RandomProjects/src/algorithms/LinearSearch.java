/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author JOWEN
 * Linear Search is a simple algorithm that checks each element one by one until it match
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15};
        int key = 5;
        int position = linearSearch(arr, key);
        
        System.out.println(position);
    }
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        
        return -1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author JOWEN
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15};
        int key = 15;
        int position = binarySearch(arr, key);
        
        System.out.println(position);
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length + 1;
        
        while (left <= right) {
            int mid = (left + right) /2;
            
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}

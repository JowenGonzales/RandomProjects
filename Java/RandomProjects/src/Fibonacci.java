
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int fib = fibonnacciIterative(num);
        System.out.println(fib);
    }
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static int fibonnacciIterative(int num) {
        if (num <= 1) {
            return num;
        } 
        int fib = 1;
        int prevFib = 1;
        
        for (int i = 2;i < num; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
    
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonnacciMemoization(int num) {
        
         if (memo.containsKey(num)) {
            return memo.get(num);
        }

        int fib;
        if (num <= 1) {
            fib = num;
        } else {
            fib = fibonacci(num - 1) + fibonacci(num - 2);
        }

        memo.put(num, fib);
        return fib;
    }
} 

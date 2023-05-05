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
        int num = 100;
        int fib = fibonacci(num);
        System.out.println(fib);
    }
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}

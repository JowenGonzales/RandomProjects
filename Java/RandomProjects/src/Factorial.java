/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        else {
            return num * factorial(num- 1);
        }
    }
}

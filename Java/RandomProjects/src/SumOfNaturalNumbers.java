/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 100;
        int sum = sumOfNaturalNumbers(num);
        System.out.println(sum);
    }
    public static int sumOfNaturalNumbers(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sumOfNaturalNumbers(num - 1);
        }
    }
}

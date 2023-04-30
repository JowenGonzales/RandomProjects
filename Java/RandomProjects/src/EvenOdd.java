/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class EvenOdd {
    public static void main(String[] args) {
        int a = 1;
        String checkEvenOdd = (a % 2) == 0 ? "Even" : "Odd"; // Ternary Operator
        
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

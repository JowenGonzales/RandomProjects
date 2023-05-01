/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 3.875;
        double time = 5; // in Years
        
        double a = principal * (1 + ((rate * 0.01) * time));
        System.out.println(a);
    }
}

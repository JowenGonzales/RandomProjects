/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double annualrate = 3.875 * 0.01;
        double compound = 12; //Monthly
        double time = 7.5;
        
        double a = Math.pow(1 + (annualrate / compound), (compound * time)) * principal;
        
        System.out.println(a);
    }
}

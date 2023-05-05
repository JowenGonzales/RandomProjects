/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOWEN
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheight = 100;
        double degreecelcius = (fahrenheight - 32) * ((double) 5 / 9);
        System.out.println(String.format("%2f", degreecelcius));
    }
}

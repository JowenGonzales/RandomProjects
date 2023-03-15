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
public class CatalanNumberAlgorithm {
     public static int catalan(int n) {
        if (n <= 1) {
            return 1;
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Catalan number for n=" + n + " is " + catalan(n));
    }
}

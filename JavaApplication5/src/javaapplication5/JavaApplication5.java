/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Nuser
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 5;

        for (int a = 0; a < jumlah; a++) {
        for (int s = 0; s < jumlah; s++) {
                if (a == (jumlah - 1) || s == 0 || s == (jumlah - 1) || a == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Codigo_2_8 {
    public static void main(String[] args) {
        double raiz1, raiz2;
        double delta;
        double a, b, c;
        a = 3;
        b = 4;
        c = 1;

        delta = b*b - 4*a*c; // delta recebe o numero 2
        raiz1 = (-1*b + Math.sqrt(delta)) / (2*a);
        raiz2 = (-1*b - Math.sqrt(delta)) / (2*a);
    }

}

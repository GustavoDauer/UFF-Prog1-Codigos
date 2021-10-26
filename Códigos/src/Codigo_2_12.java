/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Codigo_2_12 {
    public static void main(String[] args) {
        boolean fim;
        boolean parado;
        boolean ataque;
        int x = 5;  // coordenada x em pixels
        int y = 25; // coordenada y em pixels
        int vidas = 3;
        int saude = 50;
        int velocidade = 0;
        fim = (vidas == 0) || (saude <= 0);
        parado = (velocidade == 0);
        ataque = (x < 0) && (x < 10) && (y > 20) && (y < 30);
        System.out.println("fim "+fim+"\n"+"parado "+parado+"\n"+"ataque "+ataque);
    }
}

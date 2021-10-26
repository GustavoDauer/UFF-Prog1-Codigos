/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Codigo_2_9 {
    public static void main(String[] args) {
        double tempo, velocidade;

        velocidade = 30;
        tempo = 100;

        velocidade = velocidade + 10; // A velocidade vale 40 neste ponto
        velocidade += 15;             // A velocidade agora vale 55
        velocidade++;                 // Agora a velocidade vale 56

        tempo = tempo - 5;
        tempo -= 10;                  // tempo passa a valer 95
        tempo--;                      // tempo vale 84
    }

}

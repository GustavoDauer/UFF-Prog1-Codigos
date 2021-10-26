/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Codigo_2_6 {
    public static void main(String[] args) {
        int minuto;
        int hora, dia;
        int totalSegundos;
        minuto = 60;
        hora = minuto * 60;
        dia = hora * 24;
        totalSegundos = dia; // Neste caso, resultado está recebendo o
                             // conteúdo da variável dia
        System.out.print("Um dia tem: ");
        System.out.print(totalSegundos);
        System.out.print(" segundos");
    }
}

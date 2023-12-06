/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cadenaFinal = 0;

        for (int i = 1; i <= 10; i++) {
            cadenaFinal = cadenaFinal + i;
            // Usamos un String.format para almacenar la informacion que se 
            // genera dentro de un for
        }

        for (int i = 1; i < 11; i++) {
            cadenaFinal = cadenaFinal + i;
            // Usamos un String.format para almacenar la informacion que se 
            // genera dentro de un for siendo lo mismo que el anterior
        }
        System.out.printf("%s", cadenaFinal);
        // Presentamos en pantalla los valores acumulados

    }

}

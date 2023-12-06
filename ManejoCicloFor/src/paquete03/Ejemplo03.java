package paquete03;

import java.util.*;

public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensajeFinal = "Lista de Jugadores:\n";
        int limite;

        System.out.print("Ingrese el numero de jugadores a registrar: ");
        limite = entrada.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.print("Edad del jugador#" + i + ": ");
            edad = entrada.nextInt();
            System.out.print("Estatura del jugador#" + i + ": ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("Nombre del jugador#" + i + ": ");
            nombre = entrada.nextLine();
            System.out.print("Posicion del jugador#" + i + ": ");
            posicion = entrada.nextLine();

            mensajeFinal = String.format("%s%s.%s-%s-,edad %s,estatura %.2f\n",
                    mensajeFinal,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
        }
         System.out.print(mensajeFinal);
    }
}

package Unidad7;

import java.util.Scanner;

public class ejercicio7_36 {

    public static void main(String[] args) {
        System.out.println("Ubicacion    Numero    Instruccion\n"
                + "00           1007      Leer A\n"
                + "01           1008      Leer B\n"
                + "02           2007      Cargar A\n"
                + "03           3008      Sumar B\n"
                + "04           2109      almacena C\n"
                + "05           1109      Escribir C\n"
                + "06           4300      Alto\n"
                + "07           0000      variable A\n"
                + "08           0000      Variable B\n"
                + "09           0000      Resultado C\n");

        int numero[] = {1007, 1008, 2007, 3008, 2109, 1109, 4300, 0000, 0000, 0000};
        int ubicacion[] = new int[10];
        int acumulador = 0;
        int opc = 0;

        do {
            Scanner entrada1 = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
            Scanner entrada3 = new Scanner(System.in);
            System.out.println("Que desea hacer.");
            opc = entrada1.nextInt();

            if (opc == numero[0]) {
                System.out.println("coloque A.");
                ubicacion[7] = entrada2.nextInt();
            }
            if (opc == numero[1]) {
                System.out.println("coloque B.");
                ubicacion[8] = entrada3.nextInt();
            }
            if (opc == numero[2]) {
                acumulador = ubicacion[7];
            }
            if (opc == numero[3]) {
                acumulador = acumulador + ubicacion[8];
            }
            if (opc == numero[4]) {
                ubicacion[9] = acumulador;
            }
            if (opc == numero[5]) {
                double d;
                d = ubicacion[9] / 10.0;
                System.out.printf("La suma es: %.2f\n", d);
            }
            if (opc == numero[7]) {
                System.out.println("varialble A:" + ubicacion[7]);
            }
            if (opc == numero[8]) {
                System.out.println("varialble B:" + ubicacion[8]);
            }
            if (opc == numero[9]) {
                System.out.println("La suma es: " + ubicacion[9]);
            }
        } while (opc != numero[6]);

        System.out.println("\n\n     El Programa se DETUVO.");

    }
}

package Unidad7;

import java.util.Scanner;

public class Ejercicio_5_16 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numero = scanner.nextInt();

            while (numero < 1 || numero > 30) {
                System.out.print("El número ingresado no está entre 1 y 30. Ingrese otro número: ");
                numero = scanner.nextInt();
            }

            numeros[i] = numero;
        }

        for (int i = 0; i < numeros.length; i++) {
            String asteriscos = "*".repeat(numeros[i]);
            System.out.println(asteriscos);
        }
    }
}
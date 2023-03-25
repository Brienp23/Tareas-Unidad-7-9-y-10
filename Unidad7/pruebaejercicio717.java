package Unidad7;

import java.util.Scanner;
import java.util.Random;

public class pruebaejercicio717 {
    Scanner entrada = new Scanner(System.in);
    Random aleatorio = new Random();
    private int numero;
    int[] Arreglo;

    public void Recibir() {
        System.out.print("\nPor favor introduzca el numero de veces que se lanzaran los dados\n");
        numero = entrada.nextInt();
        Arreglo = new int[numero];
        Lanzar();
    }

    public void Lanzar() {
        int numero1;
        int numero2;

        for (int i = 0; i < Arreglo.length; i++) {
            numero1 = 1 + aleatorio.nextInt(6);
            numero2 = 1 + aleatorio.nextInt(6);

            Arreglo[i] = numero1 + numero2;
        }

        Contar();
    }

    public void Contar() {
        int[] Contador = new int[13];

        for (int j = 0; j < Arreglo.length; j++) {
            for (int k = 0; k < Contador.length; k++) {
                if (Arreglo[j] == k) {
                    Contador[k]++;
                }
            }
        }

        Imprimir(Contador);

    }

    public void Imprimir(int[] B) {
        for (int m = 2; m < B.length; m++) {
            System.out.printf("%d lanzamientos sumaron %d\n", B[m], m);
        }
    }

    public static void main(String[] args) {
        pruebaejercicio717 prueba = new pruebaejercicio717();
        prueba.Recibir();
    }
}

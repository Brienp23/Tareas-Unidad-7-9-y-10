package Unidad7;

import java.util.Random;

public class dado717 {
    public static void main(String[] args) {
      
        Random random = new Random();

        int[] sumas = new int[11];

        for (int i = 0; i < 36000000; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int suma = dado1 + dado2;
            sumas[suma - 2]++;
        }

        System.out.printf("%s%10s%10s%n", "Suma|", "Frecuencia|", "Porcentaje");

        for (int i = 0; i < sumas.length; i++) {
            int suma = i + 2;
            int frecuencia = sumas[i];
            double porcentaje = (double) frecuencia / 36000000 * 100;
            System.out.printf("%4d%10d%10.2f%%%n", suma, frecuencia, porcentaje);
        }
    }
}

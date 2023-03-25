package Unidad7;
import java.io.*;
import java.util.*;
public class ejercicio738 {


    // Constantes de operaciones de LMS
    public static final int READ = 10;
    public static final int WRITE = 11;
    public static final int LOAD = 20;
    public static final int STORE = 21;
    public static final int ADD = 30;
    public static final int SUBTRACT = 31;
    public static final int DIVIDE = 32;
    public static final int MULTIPLY = 33;
    public static final int BRANCH = 40;
    public static final int BRANCHNEG = 41;
    public static final int BRANCHZERO = 42;
    public static final int HALT = 43;

    // Tamaño de la memoria
    public static final int MEMORY_SIZE = 1000;

    // Memoria y registros
    private int[] memory = new int[MEMORY_SIZE];
    private int accumulator;
    private int instructionCounter;
    private int instructionRegister;

    // Etiquetas
    private Map<String, Integer> labels = new HashMap<>();

    // Entrada / salida
    private Scanner scanner = new Scanner(System.in);
    private BufferedReader reader;
    private PrintWriter writer;

    // Ejecutar un programa
    public void executeProgram() throws IOException {
        // Ciclo principal de ejecución
        while (instructionCounter < MEMORY_SIZE) {
            // Buscar la instrucción actual
            instructionRegister = memory[instructionCounter];
            int operationCode = instructionRegister / 100;
            int operand = instructionRegister % 100;

            // Ejecutar la instrucción
            switch (operationCode) {
                case READ:
                    System.out.print("Ingrese un número: ");
                    int value = scanner.nextInt();
                    memory[operand] = value;
                    instructionCounter++;
                    break;

                case WRITE:
                    System.out.println(memory[operand]);
                    instructionCounter++;
                    break;

                case LOAD:
                    accumulator = memory[operand];
                    instructionCounter++;
                    break;

                case STORE:
                    memory[operand] = accumulator;
                    instructionCounter++;
                    break;

                case ADD:
                    accumulator += memory[operand];
                    instructionCounter++;
                    break;

                case SUBTRACT:
                    accumulator -= memory[operand];
                    instructionCounter++;
                    break;

                case DIVIDE:
                    accumulator /= memory[operand];
                    instructionCounter++;
                    break;

                case MULTIPLY:
                    accumulator *= memory[operand];
                    instructionCounter++;
                    break;

                case BRANCH:
                    instructionCounter = operand;
                    break;

                case BRANCHNEG:
                    if (accumulator < 0) {
                        instructionCounter = operand;
                    } else {
                        instructionCounter++;
                    }
                    break;

                case BRANCHZERO:
                    if (accumulator == 0) {
                        instructionCounter = operand;
                    } else {
                        instructionCounter++;
                    }
                    break;

                case HALT:
                    return;

                default:
                    throw new IllegalStateException("Código de operación desconocido: " + operationCode);
            }
        }
    }
}

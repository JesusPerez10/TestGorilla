package Umg;
import java.util.Arrays;

public class Tribonacci {

    public static double[] tribonacci(double[] signature, int n) {
        // Si n es menor o igual a 3, devolver solo los primeros n elementos
        if (n <= 3) {
            return Arrays.copyOf(signature, n);
        }

        // Crear un array para almacenar la secuencia tribonacci
        double[] result = new double[n];

        // Copiar los valores iniciales
        System.arraycopy(signature, 0, result, 0, 3);

        // Generar la secuencia tribonacci
        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double[] signature = {0, 1, 1};
        int n = 10;

        double[] result = tribonacci(signature, n);

        // Imprimir los primeros n elementos de la secuencia tribonacci
        System.out.println(Arrays.toString(result));
    }
}

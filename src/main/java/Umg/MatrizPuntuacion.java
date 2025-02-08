package Umg;

public class MatrizPuntuacion {
    public static int calcularPuntuacion(int[] numeros) {
        int puntuacionTotal = 0;

        for (int num : numeros) {
            if (num == 5) {
                puntuacionTotal += 5; // Regla 3: +5 por cada aparición del número 5
            } else if (num % 2 == 0) {
                puntuacionTotal += 1; // Regla 1: +1 por cada número par (incluye el 0)
            } else {
                puntuacionTotal += 3; // Regla 2: +3 por cada número impar, excepto el 5
            }
        }

        return puntuacionTotal;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] matriz = {0, 2, 5, 3, 6, 5, 7, 8, 5};

        int puntuacion = calcularPuntuacion(matriz);

        // Mostrar la puntuación total
        System.out.println("La puntuación total es: " + puntuacion);
    }
}


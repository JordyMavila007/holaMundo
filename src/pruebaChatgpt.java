
import java.util.Scanner;
public class pruebaChatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pagoCorto = 3;
        double pagoMedio = 5;
        double pagoLargo = 8;

        System.out.println("======TIPO DE RUTA======");
        System.out.println("1. Corto (S/3.00)");
        System.out.println("2. Medio (S/5.00)");
        System.out.println("3. Largo (S/8.00)");
        System.out.print("Seleccione una ruta: ");
        int ruta = sc.nextInt();

        double tarifaBase = 0;

        switch (ruta) {
            case 1: tarifaBase = pagoCorto; break;
            case 2: tarifaBase = pagoMedio; break;
            case 3: tarifaBase = pagoLargo; break;
            default:
                System.out.println("Mensaje Error: Ruta no válida");
                return;
        }

        // Edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Mensaje Error: Edad inválida");
            return;
        }

        // Estudiante
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = sc.nextBoolean();

        double descuento = 0;

        // Aplicar mayor descuento
        if (edad >= 60) {
            descuento = 0.30; // adulto mayor
        } else if (estudiante) {
            descuento = 0.20; // estudiante
        }

        double montoPagar = tarifaBase - (tarifaBase * descuento);

        System.out.println("Monto a pagar: S/" + montoPagar);

        sc.close();
    }

}


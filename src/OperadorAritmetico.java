public class OperadorAritmetico {
    public static void main(String[] args) {
        int a = 10;
        int b =  3;

        int sumar = a + b;
        int resta = a - b;

        int multiplicacion = a * b;
        double division = a / (double)b;
        int resto = a % b;

        System.out.println("Suma: " + sumar);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Resto: " + resto);

    }
}

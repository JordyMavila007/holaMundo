import java.util.Scanner;

public class SistemaRuta3 {
    public static void main(String[] args) {


        /* Un sistema de trasporte cobra tarifa segun
         * tipo de ruta:
         * corto -> 3.00
         * medio -> 5.00
         * largo -> 8.00
         *
         * reglas:
         * 1. Si el pasajero es estudiante -> 20% de descuento
         * 2.si es adulto mayor (mayor o igual de 60 anos) -> 30% descuento
         * 3. Si no pertenece a ninguno paga normal
         *
         * adicional
         * 1. si es tipo de ruta no existe -> mensaje error
         * si la edad es menor a 0 -> mensaje error
         * solo se aplica un descuento, el mayor
         * */


        Scanner sc = new Scanner(System.in);

        //Tarifas fijas por tipo ruta
        double tarifaCorto = 3;
        double tarifaMedio = 5;
        double tarifaLargo = 8;
        //Menu de rutas
        System.out.println("======TIPO DE RUTA======");
        System.out.println("1. Corto (S/3.00)");
        System.out.println("2. Medio (S/5.00)");
        System.out.println("3. largo (S/8.00)");
        System.out.println("Seleccione la ruta: ");

        int ruta = sc.nextInt(); //leer la ruta seleccionada

        double tarifaBase = 0;// Guardara la tarifa de la ruta elegida

        //evaluar el tipo de ruta usando switch
        switch (ruta) {

            case 1:
                tarifaBase = tarifaCorto;
                break;
            case 2:
                tarifaBase = tarifaMedio;
                break;
            case 3:
                tarifaBase = tarifaLargo;
                break;
            default:
                //Si ruta no es valida, termina el programa
                System.out.println("Error: ruta no valido,(solo 1,2 o 3)");
                sc.close();
                return;

        }

        double  descuento = 0;//Descuento inicial 0%

        //Pedir edad del pasajero
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        //Validar edad negativa
        if (edad<0) {
            System.out.println("Error: edad negativo");
            sc.nextLine();
            return;
        }
        //Preguintar si es estudiante como texto
        System.out.println("Es estudiante si : true / no : false ");

        String entrada = sc.next(); //Lleer un texto String

        boolean estudiante; //Variable que guarda un valor final

        //validar que el usuario infgrese a true o false correctamente
        //validar con if;
        if (entrada.equalsIgnoreCase("true")) {
            estudiante = true;
        }else if (entrada.equalsIgnoreCase("false")) {
            estudiante = false;
        }else {
            System.out.println("Error: entrada no valido");
            sc.nextLine();
            return;
        }
        //calcular el descuento aplicable

        if (edad >=60){
            descuento = 0.3;

        }else if (estudiante){
            descuento = 0.2;
        }
        //calcular el monto final
        double montopagar = tarifaBase - (tarifaBase*descuento);
        System.out.println("Monto a pagar S/"+montopagar);
        sc.close();//cerrar el scanner al final


    }
}

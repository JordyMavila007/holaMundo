import java.util.Scanner;

public class SistemaRuta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pagoCorto = 3;
        double pagoMedio = 5;
        double pagoLargo = 8;


        System.out.println("========TIPO DE RUTA========");
        System.out.println("1. Costo (S/3.00");
        System.out.println("2. Medio (S/5.00)");
        System.out.println("3. Largo (S/8.00)");
        System.out.println("Selecione la Ruta");

        int ruta = sc.nextInt();

        double tarifaBase = 0;

        switch (ruta) {
            case 1:
                tarifaBase = pagoCorto;
                break;
            case 2:
                tarifaBase = pagoMedio;
                break;
            case 3:
                tarifaBase = pagoLargo;
                break;
            default: System.out.println("Mensaje error");
            return;
        }
        //EDAD
        System.out.println("Ingrese su edad :");
        int edad = sc.nextInt();

        if(edad < 0) {
            System.out.println("Mensaje Error");
            return;
        }

        //Estudiante
        System.out.println("Eres estudiante si = true/ no = false :");
        boolean estudiante = sc.nextBoolean();

        double desucento = 0;

        //Aplicar el descuento

        if (edad >=60 ){
            desucento = 0.3;
        }else if(estudiante){
            desucento = 0.2;
        }

        double montoPagar = tarifaBase - (tarifaBase * desucento);
        System.out.println("Monto a pagar en S/" + montoPagar);

        sc.close();





    }
}

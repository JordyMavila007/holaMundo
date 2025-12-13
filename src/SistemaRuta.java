import java.util.Scanner;

public class SistemaRuta {
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


        int pagoCorto = 3;
        int pagoMedio = 5;
        int pagolargo =8;
        String mensaje = "Mensaje Error";


        //Regla
        //1.
        System.out.println("======TIPO DE RUTA===");
        System.out.println("1. Corto (S/3.00)");
        System.out.println("2. Medio (S/5.00)");
        System.out.println("3. Largo (S/8.00)");
        System.out.println("Seleccione una ruta");
        int ruta = sc.nextInt();

        switch(ruta){
            case 1:
                System.out.println("Ingrese el nombre de edad");
                int edad = sc.nextInt();
                if(edad>=60){
                    double monto = pagoCorto*0.7;
                }else if(edad>=1){
                    double monto = pagoCorto;
                } else{
                    System.out.println(mensaje);
                    break;
                }

                System.out.println("Eres estudiante? si = true / no = false");
                boolean estudiante = sc.nextBoolean();
                if(estudiante == true){
                    if (edad >= 60) {
                        double monto = pagoCorto*0.7;
                        System.out.println("Monto a pagar es :" + monto);
                    }else{
                        double monto = pagoCorto*0.8;
                        System.out.println("Monto a pagar es :" + monto);
                    }
                }else if (edad >= 60) {
                    double monto = pagoCorto*0.7;
                    System.out.println("Monto a pagar es :" + monto);
                }else {
                    double monto = pagoCorto;
                    System.out.println("Monto a pagar es :" + monto);
                }
                break;

            case 2:
                System.out.println("Ingrese el nombre de edad");
                int edad2 = sc.nextInt();
                if(edad2>=60){
                    double monto2 = pagoMedio*0.7;
                }else if(edad2>=1){
                    double monto2 = pagoMedio;
                } else{
                    System.out.println(mensaje);
                    break;
                }
                System.out.println("Eres estudiante? si = true / no = false");
                boolean estudiante2 = sc.nextBoolean();
                if(estudiante2 == true){
                    if (edad2 >= 60) {
                        double monto2 = pagoMedio*0.7;
                        System.out.println("Monto a pagar es :" + monto2);
                    }else{
                        double monto2 = pagoMedio*0.8;
                        System.out.println("Monto a pagar es :" + monto2);
                    }
                }else if (edad2 >= 60) {
                    double monto2 = pagoMedio*0.7;
                    System.out.println("Monto a pagar es :" + monto2);
                }else {
                    double monto2 = pagoMedio;
                    System.out.println("Monto a pagar es :" + monto2);
                }
                break;

            case 3:
                System.out.println("Ingrese el nombre de edad");
                int edad3 = sc.nextInt();
                if(edad3>=60){
                    double monto3 = pagolargo*0.7;
                }else if(edad3>=1){
                    double monto3 = pagolargo;
                } else{
                    System.out.println(mensaje);
                }
                System.out.println("Eres estudiante? si = true / no = false");
                boolean estudiante3 = sc.nextBoolean();
                if(estudiante3 == true){
                    if (edad3 >= 60) {
                        double monto3 = pagolargo*0.7;
                        System.out.println("Monto a pagar es :" + monto3);
                    }else{
                        double monto3 = pagolargo*0.8;
                        System.out.println("Monto a pagar es :" + monto3);
                    }
                }else if (edad3 >= 60) {
                    double monto3 = pagolargo*0.7;
                    System.out.println("Monto a pagar es :" + monto3);
                }else {
                    double monto3 = pagolargo;
                    System.out.println("Monto a pagar es :" + monto3);
                }
                break;

            default: System.out.println(mensaje);

        }
        sc.close();
    }
}

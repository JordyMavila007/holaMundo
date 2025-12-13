import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {
        //Ejemplo IF

        int numero =9;

        if(numero > 10){
            System.out.println("El numero es mayor a 10");

        }
        //si un estudiante aprobo

        double  nota = 14.5;
        if(nota >=11 ){
            System.out.println("Aprobado");
        }
        //Verificar si un numero esta dentro de un rango
        int edad = 29;
        if(edad >=18 && edad <= 30){
            System.out.println("Edad dentro del rango permitivo");
        }
        //Validar si un cliente califica a un prestamo
        double  ingresos = 3200;
        boolean tiendeDeuda = false;
        int anisTrabajo = 1;
        int agre = 30;

        boolean califica = true;

        if (ingresos <= 2500){
            califica = false;
        }

        if (tiendeDeuda == true){
            califica = false;
        }

        if (anisTrabajo < 2){
            califica = false;
        }

        if (edad < 21 || edad >65){
            califica = false;
        }

        if (califica){
            System.out.println("Cliente apto para prestamo");
        }

        if (!califica){
            System.out.println("Cliente No apto");
        }

        //dado un puntaje de 0 a 100, clasificarlo en uno de los siguiente rangos:
        /*
        *0 a 20 -> muy bajo
        * 21 a 50 -> bajo
        * 51 a 80 -> medio
        * Fuera de rango -> Puntaje invalido
        *
        * imprimir: rango: ValorRango
        * imprimir: rango: medio alto muy bajo bajo invalido*/

        int numero2 = 20;
        String rango = "Invalido";

        if(numero2 >= 0 && numero2 <= 20){
            rango = "Muy bajo";
        }
        if (numero2 >=21 && numero2 <= 50){
            rango = "Bajo";
        }
        if (numero2 >=51 && numero2 <= 80){
            rango = "Medio";
        }
        if (numero2 <0 || numero2>80){
            rango = "Invalido";
        }

        System.out.println("Rango: " + rango);




        //else
        int num = 9;

        if (num > 10){
            System.out.println("El numero es mayor a 10");
        }else {
            System.out.println("El numero NO es mayor a 10");
        }


        //else if

        int note = 18;

        if (note >= 18){
            System.out.println("Excelente");

        }else if (note >=14){
            System.out.println("Bueno");
        }else if (note >=12 ) {
            System.out.println("No tan bueno");
        }else if (note >=10){
            System.out.println("Eres malo");
        } else {
            System.out.println("Nesecita mejorar");
        }

        //switch
        int dia = 3;

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro dia");
        }

        //switch
        Scanner scanner = new Scanner(System.in);
        String producto = scanner.nextLine();

        int stock = 2;

        switch (producto.trim().toUpperCase().replaceAll("\s+", "")){

            case "BEBIDA":
                if (stock>10){
                    System.out.println("La stock alto");
                } else if (stock>=5 && stock<=10){
                    System.out.println("La stock Moderado");
                } else {
                    System.out.println("La stock Bajo");
                }
                break;
            case "POSTRE":
                if (stock < 3){
                    System.out.println("Necesita reposicion");
                }
                break;
            default:
                System.out.println("Producto no Registrado");

        }

        //POSTRE - postre - Postre - PostRe

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
        * 1. si es tipo de ruta no existe -> mensaje erro
        * si la edad es menor a 0 -> mensaje error
        * solo se aplica un descuento, el mayor
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("======TIPO DE RUTA===");
        System.out.println("1. Corto (S/3.00)");
        System.out.println("2. Medio (S/5.00)");
        System.out.println("3. Largo (S/8.00)");
        System.out.println("Seleccione una ruta");
        int ruta = sc.nextInt();

        System.out.println("ingrese su edad: ");
        int edadPasajero = sc.nextInt();

        System.out.println("Es estudiante? (true/false) ");





    }




}

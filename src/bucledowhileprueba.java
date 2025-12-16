import java.util.Scanner;

public class bucledowhileprueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //prueba 2
        int i=1;

        do {
            System.out.println("Imprime una ves");


        }while (i<0);


        //Saludiar cuando coloca la opcion 1 y cerrar cuando coloca 0

        //Menu
        int opcion;


        do {
            System.out.println("'1' Saludar");
            System.out.println("'0' Cerrar");
            System.out.println("Ingrese la opcion");
            opcion = sc.nextInt();
            if (opcion==1) {
                System.out.println("Holaaaa");
            }
        }while (opcion!=0);


    }
}

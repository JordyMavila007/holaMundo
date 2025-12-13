import java.util.Scanner;

public class Bucledowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Ejecutando al menos una vez");
            i--;

        }while(i>0);

        //MENU
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Saludar");
            System.out.println("0. Salir");
            System.out.print("opcion: ");
            opcion = sc.nextInt();
            if (opcion==1) {
                System.out.println("Holaaaaaa!!!");
            }
        }while(opcion!=0);

        //validacion de contrasena





    }
}

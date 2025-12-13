import java.util.Scanner;

public class Deteneren0 {
    public static void main(String[] args) {
        //Sumar numero hasta que el usuario escriba el 0
        Scanner sc = new Scanner(System.in);
        int m = 1;
        int sumar = 0;
        while (m>0||m<0){
            System.out.println("Ingrese un numero : ");
            m = sc.nextInt();
            sumar += m;
        }
        System.out.println("Suma total : " + sumar);
        System.out.println("Ingrese la cantidad de numero ingresado: " );
    }
}

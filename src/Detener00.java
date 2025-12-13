import java.util.Scanner;

public class Detener00 {
    public static void main(String[] args) {
        int m;
        int sumar = 0;
        int cantidad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero (cuando colocas 0 se detiene)");

        m= sc.nextInt();
        while(m != 0){

            m = sc.nextInt();
            sumar += m;
            cantidad++;
        }
        System.out.println("La suma total: "+sumar);
        System.out.println("La cantidad del numero: "+cantidad);
    }
    //

}

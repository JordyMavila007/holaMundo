import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        //Validacion de contrasena maximo 3 intentos

        String claveCorrecta = "java123"; //acceso consedido
        String claveIncorrecta; //descuenta 1 intentoy ultimo cuenta bloqueado

        //Ingresar la clave /--> validar la clave --> SI es correcto : imprimes acceso concedido
        //--> no es correcta : imcorrecto intento restante : valor de intentos
        //--> se acabaron los intentos: imprimes cuenta bloqueado.

        Scanner sc = new Scanner(System.in);
        String clave;
        int contador = 0;
        do {
            System.out.print("Ingrese la clave correcta: ");
            clave = sc.nextLine();
            if (clave.equals(claveCorrecta)) {
                System.out.println("La clave correcta correcta");
                break;


            }else {
                contador++;
                System.out.println("La clave incorrecta, restante " + (3-contador));

            }


        }while (contador<3);
            if (contador == 3) {
                System.out.print("CuentaBloqueado ");
            }

    }
}

import java.util.Scanner;

public class contrasenaPrueba {
    public static void main(String[] args) {

        //Validacion de contrasena maximo 3 intentos

        String claveCorrecta = "java123"; //acceso consedido
        String claveIncorrecta; //descuenta 1 intento y ultimo cuenta bloqueado

        //Ingresar la clave /--> validar la clave --> SI es correcto : imprimes acceso concedido
        //--> no es correcta : imcorrecto intento restante : valor de intentos
        //--> se acabaron los intentos: imprimes cuenta bloqueado.
        Scanner sc = new Scanner(System.in);

        String clave;
        int contador = 0;

        do{
            System.out.println("Ingrese la clave que desea ingresar:");
            clave = sc.nextLine();



            if (clave.equals(claveCorrecta)){
                System.out.println("Acceso consedito");
                return;
            }else {
                contador++;
                System.out.println("No es correto, le queda "+(3-contador)+"intentos");

            }

        }while (contador <3);

                System.out.println("Cuenta Bloqueado");

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //primitivos
        int edad = 20;//4 bytes-->32bits 2147483647   2147483648
        String nombre = "JORDY";
        byte edad2 = 127; //1byte -->8bit  127
        short edad3 = 29;//2 bytes-->16bit 31768
        long numero = 1234545435435436L;// 8 bytes-->64bit 9223372036854775807

        //decimales

        float dato = 15.5f;// 4 bytes --> 32bites -->32 bites
        double datos2 = 1.7976931248623157E300; //8 bytes --> 64 bites

        //caracter
        char dato3 = 'A';// 2bytes --> (16bits)

        // booleanos

        boolean activo = true;// 1bit
        boolean inactivo = false;//i bit

        //el String es un objeto //String no es primitivo.


        System.out.println("Hello and welcome!");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);



    }
}



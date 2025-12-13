import java.util.Scanner;

public class SistemaCalificacionEvaluacion {
    public static void main(String[] args) {

    //Solicitar al usuario los siguietes datos

        Scanner scan = new Scanner(System.in);


        System.out.print("Ingresa tu Nombre: ");
        String nombre = scan.nextLine();

        System.out.print("ingrese la edad del Alumno: ");
        int edad = scan.nextInt();

        System.out.print("Nota del Primer Examen: ");
        int nota1 = scan.nextInt();

        System.out.print("Nota del Segundo Examen: ");
        int nota2 = scan.nextInt();

        System.out.print("Nota del Trabajo Final: ");
        int nota3 = scan.nextInt();

        //Calcular el promedio final

        double promedio = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);



        //Determinar si el alumno aprueba

        String resultado = (promedio >= 11) ? "Felicitaciones" : "Debes reforzar sus estudios";

        String resultado2 = (promedio >=11) ? "Aprobado" : "Desaprobado";

        String resultadoEdad = (edad >= 18) ? "Es mayor de edad" : "ALumno meno de edad, se recomeinda acompañamiento";



        //Condicion adicional


        String comentarioExtra1 = (promedio >= 10 && promedio <= 11) ? "El alumno esta a 1 punto o menos de aprobar" : "";
        String comentarioExtra2 = (promedio <=5) ? "Rendimiento critico" : "";



        //Mostrar un reporte final
        System.out.println("------------------");
        System.out.println("REPORTE ACADEMICO");
        System.out.println("------------------");
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Promedio Final " + promedio);
        System.out.println("Estado:" + resultado2);
        System.out.println("Comentario: " );
        System.out.println(comentarioExtra1);
        System.out.println(comentarioExtra2);
        System.out.println(resultadoEdad);
        System.out.println(resultado);

        scan.close();

    }
}

import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("======Con bucle=======");
        for (int i =1; i<=5 ; i++) {
            System.out.println(i);
        }

        // 0 --> 4
        // 1 -->8
        //2 --12
        //3 -->3
        int[] numeros = {4,8,12,10}; //array
        int suma =0;
        for(int j=0; j< numeros.length; j++){
            suma += numeros[j];
            System.out.println("Suma total: " + suma );

        }
        System.out.println("Suma total: " + suma );

        //EJERCICIO ALUMNOS
        //BUSCAR EL NUMERO MAYOR EN UN ARREGLO
        int[] valores = {15,8,40,22,9};
        int mayor = valores[0];
        for(int k=1; k<valores.length; k++){
            if(valores[k]>mayor){
                mayor = valores[k];

            }
        }
        System.out.println("Mayor: " + mayor);
        //Mayor : numero
        //WHILE

        int p = 10;
        while(p>0){
            System.out.println(p);
            p--;
        }

        // Ingresa un numero positivo
        Scanner sc = new Scanner(System.in);
        int n = -1;

        while(n< 0){
            System.out.println("Ingrese un numero positivo");
            n = sc.nextInt();

        }

        System.out.println("Correcto: " +n);

        //Sumar numero hasta que el usuario escriba el 0
        int m = 1;
        int sumar = 0;
        while (m>0||m<0){
            System.out.println("Ingrese un numero : ");
            m = sc.nextInt();
            sumar += m;

        }
        System.out.println("Suma total : " + sumar);

    }
}

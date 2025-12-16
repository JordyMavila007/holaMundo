import java.util.Scanner;

public class BucleForEachpractica {
    public static void main(String[] args) {

        //recorrer un arreglo de nombre y mostrar solo
        //Los que empiezan con una letra especifica

        String[] nombre= {"Ana", "Luis", "Jordy", "Jean piere"};
        Scanner sc = new Scanner(System.in);

        for(String nombre2: nombre){
            if(nombre2.startsWith("J")){
                System.out.println(nombre2);
            }
        }



    }
}

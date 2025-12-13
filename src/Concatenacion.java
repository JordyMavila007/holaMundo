public class Concatenacion {
    public static void main(String[] args) {
        // +

        System.out.println("Resultado: " + 10 + 20);

        int edad = 17;


        if (edad >= 18){

            System.out.println("Si es mayor de edad ");
        }else{
            System.out.println("No es mayor de edad ");
        }

        //Condicion ? valorSiEsVerdadero : valorSiesfalso

        String resultado = (edad >=18) ? "Es Mayor de edad" : " Es menor de edqad";

        System.out.println("Ternario " + resultado);



    }
}

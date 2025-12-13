public class practicaCondicional {
    public static void main(String[] args) {
        //dado un puntaje de 0 a 100, clasificarlo en uno de los siguiente rangos:
        /*
         *0 a 20 -> muy bajo
         * 21 a 50 -> bajo
         * 51 a 80 -> medio
         * 81 a 100 -> alto
         * Fuera de rango -> Puntaje invalido
         *
         * imprimir: rango: ValorRango
         * imprimir: rango: medio alto muy bajo bajo invalido*/

        int numero2 = 56;
        String rango = "";

        if(numero2 >= 0 && numero2 <= 20){
            rango = "Muy bajo";
        }
        if (numero2 >=21 && numero2 <= 50){
            rango = "Bajo";
        }
        if (numero2 >=51 && numero2 <= 80){
            rango = "Medio";
        }
        if (numero2 >=81 && numero2 <= 100){
            rango = "Alto";
        }
        if (numero2 <0 || numero2>80){
            rango = "Invalido";
        }

        System.out.println("Rango: " + rango);

        int numero = 51;
        String rango2 = "invalido";

        if (numero >=0 && numero <= 20){
            rango2 = "Muy bajo";
        }
        if (numero >=21 && numero <= 50){
            rango2 = "Bajo";
        }
        if (numero >=51 && numero <= 80){
            rango2 = "Medio";
        }
        if (numero >=81 && numero <= 100){
            rango2 = "Alto";
        }
        System.out.println("Rango: " + rango2);







    }
}

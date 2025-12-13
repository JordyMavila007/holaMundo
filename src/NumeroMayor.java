public class NumeroMayor {
    public static void main(String[] args) {
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

    }
}

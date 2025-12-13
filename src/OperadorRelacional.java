public class OperadorRelacional {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        //Igualdad
        boolean res = (a == b);
        System.out.println("Resultado Igualtado: " + res);

        //Diferente
        boolean res1 = (a != b);
        System.out.println("Resultado Diferente: " + res1);

        //Mayor que
        boolean res2 = (a > b);
        System.out.println("Resultado Mayor que: " + res2);

        //Menor que
        boolean res3 = (a < b);
        System.out.println("Resultado Menor que: " + res3);

        //Mayor igual

        boolean res4 = (a >= b);
        System.out.println("Resultado Mayor o igual que : " + res4);

        //Menor o igual que

        boolean res5 = (a <= b);
        System.out.println("Resultado Menor o igual que : " + res5);

        //String

        String dato1 = "Hola";
        String dato2 = "Hola";

        boolean res6 = (dato1.equals(dato2)); // ==
        System.out.println("Resultado de String: " + res6);





    }
}

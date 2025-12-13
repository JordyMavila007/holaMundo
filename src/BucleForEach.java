public class BucleForEach {
    public static void main(String[] args) {
        String[] nombre = {"Ana", "Luis","Jordy","Jean Pier"};
        for(String n: nombre){
            System.out.println(n);
        }
        //recorrer un arreglo de nombre y mostrar solo
        //Los que empiezan con una letra especifica
        String[] astistas ={"Adele", "Artic Monkeys", "Faraon", "Bruno Mars", "Avicii"};
        for(String artista: astistas){
            if(artista.startsWith("B")){
                System.out.println(artista);
            }
        }

    }
}

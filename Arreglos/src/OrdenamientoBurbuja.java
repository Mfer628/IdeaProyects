import java.sql.SQLOutput;
import java.util.Scanner;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        /*
        String[] productos = {"Coca", "Squirt", "Papas", "Pan", "Leche", "Medicina","Avestuz", "Bebe"};
        int cantidad_arreglo = productos.length;

        for (int i = 0; i<cantidad_arreglo;i++){
            for (int j = 0 ; j<cantidad_arreglo; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
            }

        }
        System.out.println("Usando for");
        for (int i = 0; i<cantidad_arreglo;i++){
            System.out.println("para indice" + i + " : " +productos[i]);

        }


         */
    //Combinar arreglos
        Scanner in = new Scanner(System.in);

        int[] a;
        a = new int[5];


        for (int i = 0; i < a.length; i++){
            System.out.println("Dame los numeros del primer arreglo");
            a[i] = in.nextInt();
        }


        System.out.println("Dame el numero a buscar");
        int num_buscar = in.nextInt();
        int i = 0;
        boolean bandera = false;
        for (; i < a.length; i++ ){
            System.out.println(a[i]);
            if (a[i] == num_buscar){
                //System.out.println("El numero fue encontrado" + num_buscar);
                bandera = true;
            }
        }



        if (bandera == true){
            System.out.println("El elemento fue encontrado");
        }else {
            System.out.println("El elemento no se encontro");
        }

    }


    
}

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
 /*
        int[] numeros = new int[4];
        Scanner in = new Scanner(System.in);

         for (int i = 0 ;i < numeros.length ; i++){
             System.out.println("Dame datos: ");
             //Una parte importante de los arreglos
             //Cuando se quiere llenar el arreglo se tiene que guardar en el arreglo

             numeros[i] = in.nextInt();
         }
        System.out.println("El arreglo esta lleno");
         //Mostrando el arreglo de forma inversa
        //numeros
         for (int i = numeros.length-1  ; i >= 0  ; i--){
             System.out.println(numeros[i]);
         }
         //Pidiendo el arreglo que desea modificar
        int elementoModificar;
        System.out.println("Que numero del arreglo deseas modificar");
        elementoModificar=in.nextInt();
        for (int i = numeros.length-1  ; i >= 0  ; i--){
            System.out.println(numeros[i]);
        }


        //Modificando el arreglo


// 0 1 2 3 4 5 6 7 8 9 10

        for (int  i = 10 ; i > 1; i--){
            System.out.println("i = " + i);
        }


// Desplazar elementos
        int[] elementos = new int[10];
        for (int i = 0 ; i < elementos.length; i++){
            System.out.println("Numeros del 1 - 10");
            elementos[i] = in.nextInt();
        }
        //Declarando el ultimo valor
        int ultimo_valor  = elementos[elementos.length-1];
        for (int i = elementos.length -2 ; i >= 0; i--){
            elementos[i+1] = elementos[i];

        }
    elementos[0] =ultimo_valor;
        System.out.println("Mostrando arreglo final");
        for (int i = 0; i < elementos.length; i++){
            System.out.println(elementos[i]);
        }


        // Agregar elemento al arreglo

        int[] elementos = new int[10];
        int num , posisicion;
        for (int i = 0 ; i < elementos.length - 1; i++){
            System.out.println("Numeros del 1 - 10");
            elementos[i] = in.nextInt();
        }
        System.out.println("Dijita el elemento a introducir");
        num = in.nextInt();
        System.out.println("Dijitame la posicion a elegir de ( 0 - 9) ");
        posisicion = in.nextInt();

        for (int i = elementos.length -2; i >= posisicion; i--){
            elementos[i+1] = elementos[i];

        }
        elementos[posisicion] =num;
        System.out.println("Mostrando el arreglo modificado");
        for (int i = 0; i <elementos.length; i++){
            System.out.println(elementos[i]);
        }



        int[] elementos = new int[7];
        int num, posisicion;
        for (int i = 0; i < elementos.length - 1; i++) {
            System.out.println("Numeros del 1 - 6");
            elementos[i] = in.nextInt();
        }
        System.out.println("Dijita el elemento a introducir");
        num = in.nextInt();

posisicion = 0;
    while (posisicion < 6 && num > elementos[posisicion]){
    posisicion ++;
    }

for (int i = elementos.length - 2; i >=posisicion; i--){
    elementos[i+1] = elementos[i];
}
elementos[posisicion] = num;

        System.out.println("El nuevo arreglo mofificado");
        for (int i = 0; i<elementos.length; i++){
            System.out.println(elementos[i]);
        }

  */
        //Eliminar elemento de un arreglo
        int[] elementos = new int[10];
        //Llenando el arreglo
        for (int i = 0 ; i < elementos.length; i++){
            System.out.println("Numeros del 1 - 10");
            elementos[i] = in.nextInt();
        }
        System.out.println("Dame la posicion que deseas eliminar entre (0 - 9)");
        int posicion = in.nextInt();
        for (int i = posicion; i < elementos.length -1; i++){
            elementos[i] = elementos[i+1];
        }
        int[] b = new int[elementos.length-1];
        System.arraycopy(elementos, 0,b,0,b.length );
            for (int i = 0; i < b.length; i++){
                System.out.println(i + "=>" + elementos[i]);
                }
    }
}

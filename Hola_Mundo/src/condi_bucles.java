import javax.swing.*;
import java.util.Scanner;

public class condi_bucles {
    public static void main(String[] args) {
/*


        Scanner in = new Scanner(System.in);
        System.out.println("Dame tres numeros");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 < num2 && num1 < num3) {

            System.out.println(num1);
            if (num2 > num3) {
                System.out.println(num3);
                System.out.println(num2);
            }else{
                System.out.println(num2);
                System.out.println(num3);
            }

        }
        else if (num2 < num1 && num2 < num3){
            System.out.println(num2);
            if (num1 > num3) {
                System.out.println(num3);
                System.out.println(num1);

            }else {
                System.out.println(num1);
                System.out.println(num3);
            }
        }
         else if (num3 < num1 && num3 < num2) {
            System.out.println(num3);
            if (num1 > num2){
                System.out.println(num2);
                System.out.println(num1);
            }else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }

         */

/*

        int num_multiplicar = 9;
        int resultado ;
        for (int i = 1 ; i <= 10 ;i++ ){

            System.out.println( num_multiplicar + "*" + i + " = " + num_multiplicar * i);
        }

        for (int i = 0; i <= 0 ;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= 1 ;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= 2 ;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= 3 ;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= 4 ;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= 5 ;i++){
            System.out.print("*");
        }

    int resultado = 0;
    int n = 10 ;
    int a = 0;
    int b = 1;
    for (int i = 1 ; i <= n; i++){
        System.out.println(a + " ");
        int suma = a + b;
        a = b;
        b = suma;




       int num_mult = 1;

        do{
            num_mult = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero que deseas multiplicar"));
            if (num_mult <0 ){
                System.out.println("Numero Incorrecto");
            }else {
                for (int i = 1; i<= 10; i++){

                    System.out.println(num_mult * i);
                }
            }
        }while (num_mult < 0);

        int num_mult = 0;
        float resultado = 0;

        do{
            int num_mult2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero que deseas multiplicar"));
            if (num_mult2 < 0 ){
                System.out.println("Numero Incorrecto");
            }else {
                for (int i = 1;  i <= num_mult2; i++){
                    //System.out.println(i)
                    resultado += (1/(float)i);
                }

                System.out.println(resultado);
            }
        }while (num_mult < 0);





        int num_mult ;
        float resultado = 1;

        do{
            num_mult = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero que deseas multiplicar"));
            if (num_mult < 0 ){

                System.out.println("Numero Incorrecto");
            }else {
                for (int i = 1;  i <= num_mult; i++){
                    //System.out.println(i)

                    resultado *= (1/(float)i);
                }

                System.out.println(resultado);
            }
        }while (num_mult < 0);



        Scanner in = new Scanner(System.in);

        boolean validar = false;
        int n ;

        do {

            System.out.println("Dijitame la catidad de numeros");
            n = in.nextInt();
            if (n<0){
                System.out.println("Numero Incorrecto");
            }else
            {
            int[] numeros = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Ingresa los numeros");
                numeros[i] = in.nextInt();
            }

            int contadorMeno = 0;
            int contadorMayo = 0;
            int contNull = 0;
            for (int i = 0; i < n; i++) {

                if (numeros[i] < 0) {
                    contadorMeno++;
                } else if (numeros[i] > 0) {
                    contadorMayo++;
                } else {
                    contNull++;
                }

            }
            System.out.println("Numeros menores que cero: " + contadorMeno);
            System.out.println("Numeros mayores a cero: " + contadorMayo);
            System.out.println("Numeros nulos : " + contNull);
            }
        }while (n < 0);



        // While
        int i = 0;
        //Mientras la setencia sea  verdadera. Cuando es falsa deja de funcionar
        while (i < 5){
            System.out.println(i);
            i++;
        }


        int i = 0;
        boolean prueba = true; //bandera
        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println(i);
            i++;
        }


//do - while // Se ejecuta al menos una sola vez apesar de que s
        //Primero ejecuta y luego evalua para volve a iterar
       boolean prueba = false;
        do{
            System.out.println("Prueba do while");



        }while (prueba);
        System.out.println("Termino el ciclo por que es: " + prueba);



 */
//Foreach

    int[] numeros  = {1,2,3,4,5,6,7,8,9};
        for (int num: numeros) {
            System.out.println(num);
        }


    }
}

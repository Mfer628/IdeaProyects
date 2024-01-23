
//Anida un valor primitivo


public class WrapperInteger {

    public static void main(String[] args) {

        int intPrimitivo = 2652362;
        Integer intObjeto = Integer.valueOf(51854);
        Integer intObejo2 = intPrimitivo;
        System.out.println("intObejto " + intObjeto);
        int num = intObjeto;
        System.out.println(num);
        int num2 = intObejo2.intValue(); //Retrna entero positivo
        System.out.println(num2);


        String valorTVLcd = "67000";
        Integer valor = Integer.valueOf(valorTVLcd);
        System.out.println("El  numero es: "+valor);



        Short shortObject = intObjeto.shortValue();
        System.out.println();
        System.out.println("shortObject = " + shortObject);

    }

}

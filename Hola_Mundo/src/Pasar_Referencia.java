public class Pasar_Referencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12};
        System.out.println("Iniciamos en el metodo main  " );
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " +edad[i]);
        }
        System.out.println("Antes de llamar el motodo test ");
        test(edad);
        System.out.println("Despuer de llamar el motodo test ");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " +edad[i]);
        }
        System.out.println("Finaliza el metodo main");
    }
    public static void test (int[] edadArr){
        System.out.println("Metodo test");
        for (int i = 0; i<edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
    }
}

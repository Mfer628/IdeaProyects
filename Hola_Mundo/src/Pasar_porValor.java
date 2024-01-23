public class Pasar_porValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Metodo main: " + i);
        test(i);
    }

    //Si declaramos un metodo de tipo estatico no es necesario instanciar
    //la clase por que tamto el main y el metodo son estaticos
    public static void test(int i ){
        System.out.println("Iniciamos metodo test: " + i);
    }
}

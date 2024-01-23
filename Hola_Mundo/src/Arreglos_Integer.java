public class Arreglos_Integer {
    public static void main(String[] args) {
        Integer[] numero = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int suma = 0;
        for(Integer i: numero){
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }
        System.out.println("Suma: " +suma);

        suma=0;

        for(Integer i: numero){
            if (i % 2 == 0) {
                suma +=i;
            }
        }
        System.out.println("Suma: " +suma);
    }

}

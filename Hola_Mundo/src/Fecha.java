import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("La fecha es: " + date);
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");

        String fechaStr = df.format(date);
        System.out.println("La fecha es: "+fechaStr);
        long j = 0;
        for (int i = 0; i < 10000 ;i++ ){
            j+=i;
        }
        System.out.println("Resultado de la suma: " + j);

        Date fecha2 = new Date();
        long tiempofinal = fecha2.getTime() - date.getTime();
        System.out.println("Tiempo trancurrido en el for " + tiempofinal);
    }

}

import java.lang.reflect.Array;
import java.util.Scanner;

public interface Conversion_datos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        int i = 22750;
        short conversion = (short) i ;
        System.out.println(conversion);
        char b = (char) i;
        System.out.println(b);
        //Los parentesis se llaman castear osea forzar la conversión
        float f = (float) i;
        System.out.println(f);
//lOGIN con arreglos

        System.out.println("Dijitame Nombre de Usuario");
        String user= in.next();
        System.out.println("Dijitame tu contraseña");
        String password = in.next();

        String [] login = {"Fernanda" , "1234"};
        if (login[0].equals(user) && login[1].equals(password)  ){
            System.out.println("El usuario y contraseña es correcto");
        }else{
            System.out.println("Usuario Incorrecto");
        }

//lOGIN con arreglos y for
        String [] login = {"Fernanda" , "1234"};

        System.out.println("Dijitame Nombre de Usuario");
        String user= in.next();
        System.out.println("Dijitame tu contraseña");
        String password = in.next();

        for (int i = 0; i<login.length -1 ; i+=2){
            if (login[i].equals(user) && login[i+1].equals(password)){
                System.out.println("Usuario y contraseña correctos ");
            }
            //System.out.println(i+1);
        }

 */
        //Arreglos diferentemente declarados
        boolean correcto = false;
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Fernanda";
        passwords[0] = "1234";

        usernames[1] = "Sara";
        passwords[1] = "5678";

        usernames[2] = "Ale";
        passwords[2] = "8910";
        System.out.println("Dijitame Nombre de Usuario");
        String user= in.next();
        System.out.println("Dijitame tu contraseña");
        String password = in.next();
        for (int i = 0; i<usernames.length; i++){
            if((usernames[i]).equals(user) && passwords[i].equals(password)){
                //System.out.println("Credenciales correctas");
                correcto = true;
            }
        }

        if (correcto ==  true){
            System.out.println("Usuario correcto");
        }else {
            System.out.println("Usuario incorrecto");
        }
    }
}

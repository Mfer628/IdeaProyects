import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Bienvenido Usuario");
        //int edad;
        Scanner in = new Scanner(System.in);
        //System.out.println("Dijitame tu edad");
        String Usuario = "Fer";
        String password = "1234";
        System.out.println("Dijitame tu Nombre de Usuario");
        String user = in.next();
        System.out.println("Dijitame tu contraseña");
        String contraseña = in.next();

        //if (Usuario.equals(user) && password.equals(contraseña))
        if (user.equals(Usuario) && contraseña.equals(password)){
            System.out.println("Contraseña Correcta");

        }else {
            System.out.println("Contrasela Incorrecta");
        }




    }
}
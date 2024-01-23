import javax.swing.*;

public class Arreglos {

    public static void main(String[] args) {
        String[] nombres = {"Fernanda" , "Sara", "Juan", "Rodrigo", "JOrge"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            //Si quisieramos que un nombre no lo imprimiera
            //equals o IngnoreCase f
            if (nombres[i].equalsIgnoreCase("Fernanda") ||
                    nombres[i].equalsIgnoreCase("Jorge")){
                continue; //continua
            }
            System.out.println(i + ".-" + nombres[i]);
        }
        //Buscar un elemento

        String buscar = JOptionPane.showInputDialog("Ingresa el nombre que deseas buscar");
        System.out.println("El elemento que se busco es: "+buscar);
        boolean encontrado = false;
        for (int i=0; i<count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado == true){
            JOptionPane.showMessageDialog(null ,buscar  + "Si se encontro");
        }else {
            JOptionPane.showMessageDialog(null ,buscar  + "No se encontro");
        }

        System.out.println();

    }
}

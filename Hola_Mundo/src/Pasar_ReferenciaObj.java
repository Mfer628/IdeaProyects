class persona {
    private String Nombre ;
//Cambiar los valores de los atributos
    public void modificar_Nombre(String nuevo_valor){
        this.Nombre = nuevo_valor;
    }
    public String leerNombre (){
        return this.Nombre;
    }
}

public class Pasar_ReferenciaObj {
    public static void main(String[] args) {
        persona edad = new persona();
        edad.modificar_Nombre("Fernanda");
        edad.leerNombre();
        System.out.println(edad.leerNombre());

    }


}

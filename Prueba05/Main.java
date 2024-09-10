package Prueba05;

public class Main {
    public static void main(String[] args){
        // Instanciación de las clases
        Documento word = new Documento("Word","A4");
        Imagen imagen = new Imagen("A2");
        // LLamada a metodos de los objetos
        System.out.println(word);
        word.imprimir();
        System.out.println(imagen);
        imagen.imprimir();

    }
}

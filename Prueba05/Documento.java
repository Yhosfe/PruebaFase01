package Prueba05;

public class Documento implements Imprimible{
    private String tipo;
    private String tamano;
    // Constructor
    public Documento(String tipo , String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
    }
    // Implementacion de metodos de la interfaz
    @Override
    public void imprimir(){
        System.out.println("Imprimiendo documento");
    }
    @Override
    public String toString() {
        return "Documento ("+this.tipo+", "+this.tamano+")";
    }

}

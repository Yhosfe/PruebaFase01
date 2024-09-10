package Prueba05;

public class Imagen implements Imprimible{
    private String tamano;

    public Imagen(String tamano) {
        this.tamano = tamano;
    }
    // Implementacion de metodos de la interfaz
    @Override
    public void imprimir() {
        System.out.println("Imprimido imagen");
    }
    @Override
    public String toString() {
        return "Imagen (" + tamano + ")";
    }
}

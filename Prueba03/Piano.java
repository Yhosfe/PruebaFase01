package Prueba03;

public class Piano implements InstrumentoMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando el Piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando el Piano");
    }
}

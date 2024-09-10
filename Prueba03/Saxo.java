package Prueba03;

public class Saxo implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando el Saxo");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando el Saxo");
    }
}

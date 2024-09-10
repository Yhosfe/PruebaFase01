package Prueba03;

public class Main {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("");
        // Creacion de Lista instrumentos
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[2];
        // Instanciando un intrumento especifico en la lista
        instrumentos[0] = new Piano();
        instrumentos[0] = new Saxo();

        try {
            for (InstrumentoMusical instrumento : instrumentos) {
                instrumento.afinar();
                instrumento.tocar();
            }
        } catch (Exception e) {
            npe.getMessage();
        }
    }
}

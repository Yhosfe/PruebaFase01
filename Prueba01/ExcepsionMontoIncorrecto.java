package Prueba01;

public class ExcepsionMontoIncorrecto {
    public void lanzarExcepcionMontoIncorrecto(double monto,double saldo) throws Exception {
        if(monto > saldo){
            throw new Exception("Saldo insuficiente");
        }
    }
}

package Prueba01;

public class CuentaBancaria {
    private Persona propietario;
    private int numero;
    private double saldo;
    public CuentaBancaria(Persona pro,int numero, double saldo) {
        this.propietario = pro;
        this.numero = numero;
        this.saldo = saldo;
    }
    public void montoRetirar(double monto){
        ExcepsionMontoIncorrecto exc = new ExcepsionMontoIncorrecto();
        try {
            if(monto > this.saldo){
                exc.lanzarExcepcionMontoIncorrecto(monto, this.saldo);
            } else {
                this.saldo -= monto;
                System.out.println("Nuevo saldo: " + this.saldo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}

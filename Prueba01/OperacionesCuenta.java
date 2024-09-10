package Prueba01;

import java.util.Scanner;

public class OperacionesCuenta {
    private CuentaBancaria cuenta;
    public OperacionesCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    public void retirar(double monto) {
        cuenta.montoRetirar(monto);
    }
}

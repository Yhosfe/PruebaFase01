package Prueba01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creacion de objetos
        Persona per1 = new Persona("Yhosfer");
        CuentaBancaria cuenta1 = new CuentaBancaria(per1,90101,200);
        OperacionesCuenta op1 = new OperacionesCuenta(cuenta1);

        // Realizar Operacion
        System.out.println("Operacion de Retiro ");
        System.out.print(" Ingrese monto: ");
        Scanner sc = new Scanner(System.in);
        int monto = sc.nextInt();

        // LLamado al medo retirar del objeto op1(OperacionesCuenta)
        op1.retirar(monto);
    }
}

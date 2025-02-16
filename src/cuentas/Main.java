
package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0.0);
        operativa_cuenta(cuenta1, 2300, 695, 0.0f); // Añadimos cantidad
    }

    public static void operativa_cuenta(CCuenta cuenta, double cantidadRetirar, double cantidadIngresar, float cantidad) {
        double saldoActual = cuenta.estado(); // Actualizado para obtener el saldo actual
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(cantidadRetirar);
            System.out.println("Se han retirado " + cantidadRetirar + " euros.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            cuenta.ingresar(cantidadIngresar);
            System.out.println("Se han ingresado " + cantidadIngresar + " euros.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }

        // Mostrar saldo después de las operaciones
        saldoActual = cuenta.estado();
        System.out.println("El saldo final es " + saldoActual);
    }
}

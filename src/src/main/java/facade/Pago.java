
package facade;

// Subsistema Pago: se encarga de procesar el pago
public class Pago {
    public boolean procesarPago(String tarjeta, double monto) {
        // Simula el pago con tarjeta y devuelve éxito
        System.out.println("Procesando pago con tarjeta " + tarjeta + " por $" + monto);
        return true; // simulamos que siempre se aprueba
    }
}

package facade;

// Facade: simplifica el uso de los subsistemas Carrito, Pago y Envio
public class TiendaFacade {

    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    // Constructor que recibe las instancias de los subsistemas
    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
    }

    // Método que coordina todo el proceso de compra
    public void comprar(String producto, int cantidad, String tarjeta, double monto, String direccion) {
        carrito.agregarProducto(producto, cantidad);          // Agregar producto al carrito

        if (pago.procesarPago(tarjeta, monto)) {             // Procesar pago
            envio.coordinarEnvio(direccion);                 // Coordinar envío
            System.out.println("Compra completada con éxito!");
        } else {
            System.out.println("Pago rechazado.");
        }
    }
}

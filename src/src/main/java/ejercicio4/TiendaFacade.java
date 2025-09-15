package ejercicio4;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    //constructor
    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
    }

    // metodo
    public void comprar(String producto, int cantidad, String tarjeta, double monto, String direccion) {
        carrito.agregarProducto(producto, cantidad);          // agregar al carrito

        if (pago.procesarPago(tarjeta, monto)) {   // procesar pago
            envio.coordinarEnvio(direccion);        // enviar producto
            System.out.println("Compra completada con éxito!");
        } else {
            System.out.println("Pago rechazado.");
        }
    }
}

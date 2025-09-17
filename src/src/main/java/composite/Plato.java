package composite;

// Clase que representa un plato individual
public class Plato implements ElementoMenu {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        // Muestra el nombre y precio del plato
        System.out.println(nombre + " - $" + precio);
    }
}
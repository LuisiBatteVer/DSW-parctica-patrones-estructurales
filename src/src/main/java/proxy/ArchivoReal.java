package proxy; // Define el paquete donde se encuentra la clase

// ArchivoReal realiza la operación real de abrir un archivo
public class ArchivoReal implements Archivo { // Implementa la interfaz Archivo,

    private String nombre; // Atributo que guarda el nombre del archivo

    // Constructor que recibe el nombre del archivo y lo guarda en el atributo
    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override // Indica que este método sobrescribe el definido en la interfaz Archivo
    public void abrir(String usuario) {
        // Simula la acción de abrir el archivo mostrando un mensaje por consola
        System.out.println("Archivo " + nombre + " abierto por " + usuario);
    }

}
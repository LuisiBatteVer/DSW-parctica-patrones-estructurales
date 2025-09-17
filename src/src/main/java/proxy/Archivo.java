package proxy; // Define el paquete donde se encuentra la interfaz

// Interfaz que define la operación común para abrir un archivo
public interface Archivo {

    // Método que debe implementar cualquier clase que represente un archivo
    // Recibe como parámetro el nombre del usuario que intenta abrirlo
    void abrir(String usuario);
}

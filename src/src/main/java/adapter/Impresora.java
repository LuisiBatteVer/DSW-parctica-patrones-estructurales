package adapter; 1.ADAPTER;

// Interfaz común para imprimir documentos
// Permite que el sistema trabaje con cualquier tipo de impresora (PDF, texto, etc.)
public interface Impresora {

    // Método que debe implementar cualquier clase que represente una impresora
    // Recibe como parámetro el contenido del documento a imprimir
    void imprimir(String documento);
}


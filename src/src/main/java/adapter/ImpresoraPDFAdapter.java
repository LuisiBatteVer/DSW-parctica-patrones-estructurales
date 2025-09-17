package adapter;

// Clase Adapter que permite usar una impresora PDF como si fuera una impresora genérica
// Implementa la interfaz Impresora que espera el sistema
public class ImpresoraPDFAdapter implements adapter.Impresora {

    private adapter.ImpresoraPDF impresoraPDF; // Guarda la referencia a la impresora PDF real

    // Constructor que recibe la impresora PDF real
    public ImpresoraPDFAdapter(adapter.ImpresoraPDF impresoraPDF) {
        this.impresoraPDF = impresoraPDF;
    }

    @Override // Sobrescribe el método de la interfaz Impresora
    public void imprimir(String documento) {
        // Traduce la llamada genérica imprimir() a la específica de ImpresoraPDF
        impresoraPDF.imprimirPDF(documento); // Llama al método específico de la clase ImpresoraPDF
    }
}


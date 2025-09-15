package ejercicio1;

public class ImpresoraTXTAdapter implements Impresora {
    private ImpresoraTXT impresoraTXT;  //atributo de la clase incompatible impresoraTXT

    // Constructor: recibe un objeto ImpresoraTXT
    public ImpresoraTXTAdapter(ImpresoraTXT impresoraTXT) {
        this.impresoraTXT = impresoraTXT;
    }

    @Override   //porque utiliza un metodo de una interfaz (la de ImpresoraPDF) o sobrescribe un método de una clase padre.
    public void imprimir(String documento) {
        // Traduce la llamada genérica a la específica de ImpresoraTXT
        impresoraTXT.imprimirTXT(documento);
    }
}


package ejercicio1;

public class ImpresoraPDFAdapter implements Impresora{
    private ImpresoraPDF impresoraPDF;

    public ImpresoraPDFAdapter(ImpresoraPDF impresoraPDF) {
        this.impresoraPDF = impresoraPDF;
    }

    @Override   //porque utiliza un metodo de una interfaz (la de ImpresoraPDF) o sobrescribe un método de una clase padre.
    public void imprimir(String documento) { //implementa el metodo comun que el siste va a usar
        // Traduce la llamada genérica Imprimir() a la específica de ImpresoraPDF, imprimirPDF()
        impresoraPDF.imprimirPDF(documento); //llama al metodo especifico de la clase impresoraPDF
    }
}


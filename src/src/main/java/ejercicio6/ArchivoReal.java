package ejercicio6;

public class ArchivoReal implements Archivo {
    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir(String usuario) {
        System.out.println("Archivo " + nombre + " abierto por " + usuario);
    }


}

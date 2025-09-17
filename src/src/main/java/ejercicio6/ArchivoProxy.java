package ejercicio6;

import java.util.Arrays;
import java.util.List;

// Clase Proxy que controla el acceso a los archivos
// Implementa la interfaz Archivo para poder reemplazar al objeto real
public class ArchivoProxy implements Archivo {

    private String nombre; // Guarda el nombre del archivo
    private ArchivoReal archivoReal; // Referencia al objeto real (ArchivoReal)

    // Lista estática de usuarios autorizados, compartida por todas las instancias
    private static List<String> usuariosPermitidos = Arrays.asList("admin", "juan");

    // Constructor que recibe el nombre del archivo y lo guarda en el atributo 'nombre'
    public ArchivoProxy(String nombre) {
        this.nombre = nombre;
    }

    @Override // Sobrescribe el método abrir definido en la interfaz Archivo
    public void abrir(String usuario) {

        // Control de acceso: verificar si el usuario está autorizado
        if (usuariosPermitidos.contains(usuario)) {

            // Si el objeto real no existe, se crea solo cuando hace falta
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombre);
            }

            // Delegación: el proxy permite que el objeto real realice la acción
            archivoReal.abrir(usuario);

        } else {
            // Usuario no autorizado, sale por pantalla que denega el acceso
            System.out.println("Acceso denegado para el usuario: " + usuario);
        }
    }
}

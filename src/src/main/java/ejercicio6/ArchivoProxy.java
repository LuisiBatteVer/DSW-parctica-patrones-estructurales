package ejercicio6;
import java.util.Arrays;
import java.util.List;

public class ArchivoProxy implements Archivo {
    private String nombre; //guarda el nombre del archivo
    private ArchivoReal archivoReal; //Referencia al objeto real. Es el dato que identifica el recurso que controla el proxy.
    private static List<String> usuariosPermitidos = Arrays.asList("admin", "juan"); //Contiene una lista con los usuarios autorizados.

    //Constructor que recibe el nombre del archivo y lo asigna al campo nombre
    public ArchivoProxy(String nombre) {
        this.nombre = nombre;
    }

    @Override //sobreescribe el metodo abrir de Archivo,
    public void abrir(String usuario) {
        if (usuariosPermitidos.contains(usuario)) { // lista de usuarios permitidos contiene al usuario?
            if (archivoReal == null) { // existe el ArchivoReal? si no existe lo crea
                archivoReal = new ArchivoReal(nombre);
            }
            archivoReal.abrir(usuario); //cdo el archivo real existe y el ususario es permitodo el proxy deja que ese usuario abra el archivo
        } else {
            System.out.println("Acceso denegado para el usuario: " + usuario);
        }
    }
}

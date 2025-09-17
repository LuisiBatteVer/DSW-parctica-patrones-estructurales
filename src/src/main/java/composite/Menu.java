package composite;

package ejercicio7;

import java.util.ArrayList;
import java.util.List;

// Clase que representa un menú completo, puede contener Platos o submenús
public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    // Agrega un elemento al menú (puede ser Plato o Menu)
    public void agregar(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("Menú: " + nombre);
        for (ElementoMenu elemento : elementos) {
            elemento.mostrar(); // Llama a mostrar de cada elemento
        }
    }
}

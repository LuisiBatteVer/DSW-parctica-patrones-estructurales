package flyweight;

import java.util.HashMap;
import java.util.Map;

// Fabrica que gestiona los objetos Arbol (Flyweights)
public class FabricaArboles {

    private Map<String, Arbol> arboles = new HashMap<>();
    // Mapa que guarda los árboles ya creados para reutilizarlos

    // Devuelve un árbol con las características indicadas
    // Si ya existe uno igual, lo reutiliza; si no, lo crea
    public Arbol obtenerArbol(String tipo, String color, String textura) {

        // Genera una clave única según las características
        String clave = tipo + "-" + color + "-" + textura;

        // Busca si ya existe un árbol con esa clave
        Arbol arbol = arboles.get(clave);

        // Si no existe, crea uno nuevo y lo guarda en el mapa
        if (arbol == null) {
            arbol = new ArbolConcreto(tipo, color, textura);
            arboles.put(clave, arbol);
        }

        // Devuelve el árbol (existente o recién creado)
        return arbol;
    }
}


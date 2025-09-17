package flyweight;

// Interfaz que define el contrato común de todos los árboles
public interface Arbol {

    // Método para dibujar el árbol en una posición específica
    // El estado extrínseco es la posición (x,y) que cambia según dónde se dibuje
    void dibujar(int x, int y);
}

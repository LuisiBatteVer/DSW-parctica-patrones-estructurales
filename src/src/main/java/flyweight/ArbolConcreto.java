package flyweight;

// Clase concreta que representa un árbol con características compartidas (intrínsecas)
public class ArbolConcreto implements Arbol {

    private String tipo;    // Tipo de árbol (pino, roble, etc.)
    private String color;   // Color del árbol
    private String textura; // Textura del árbol

    // Constructor que inicializa las características intrínsecas del árbol
    public ArbolConcreto(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
        System.out.println("Creando árbol tipo: " + tipo); // Indica que se creó un nuevo árbol
    }

    @Override
    public void dibujar(int x, int y) {
        // Dibuja el árbol en la posición (x,y) usando sus características intrínsecas
        System.out.println("Dibujando árbol '" + tipo + "' en (" + x + "," + y + ")");
    }
}
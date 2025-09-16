package ejercicio5;
// clase intrinseca: la que comparten caracteristicas
public class ArbolConcreto implements Arbol {
    private String tipo;
    private String color;
    private String textura;

    public ArbolConcreto(String tipo, String color, String textura) {
        this.tipo = tipo;
        this.color = color;
        this.textura = textura;
        System.out.println("Creando árbol tipo: " + tipo);
    }

    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol '" + tipo + "' en (" + x + "," + y + ")");
    }

}

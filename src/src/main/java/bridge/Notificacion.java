package bridge;
// La Abstracción
public abstract class Notificacion {
    protected CanalEnvio canal;

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }
    public abstract void enviar(String mensaje);
}

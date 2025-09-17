package bridge;

public class Promocion extends Notificacion{
    public Promocion(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        canal.enviarMensaje("PROMOCIÓN: " + mensaje);
    }
}

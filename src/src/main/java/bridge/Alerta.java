package bridge;

public class Alerta  extends Notificacion {
    public Alerta(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        canal.enviarMensaje("ALERTA: " + mensaje);
    }
}

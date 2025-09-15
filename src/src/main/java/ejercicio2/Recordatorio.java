package ejercicio2;

public class Recordatorio extends Notificacion {
    public Recordatorio(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        canal.enviarMensaje("RECORDATORIO: " + mensaje);
    }
}

package ejercicio2;
// Implementación concreta: SMS
public class SMS implements CanalEnvio {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

}

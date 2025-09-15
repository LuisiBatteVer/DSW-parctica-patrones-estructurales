package ejercicio2;
// Implementación concreta: Email
public class Email implements CanalEnvio {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}

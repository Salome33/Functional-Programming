package EjemplosIndividuales;

import java.util.function.Consumer;

public class SistemaNotificaciones {
    public static void main(String[] args) {

        Consumer<String> enviarNotificacion = mensaje ->
                System.out.println("Notificación enviada: " + mensaje);

        enviarNotificacion.accept("Tienes un nuevo mensaje");
        enviarNotificacion.accept("Tu pedido ha sido enviado");
        enviarNotificacion.accept("Recordatorio de reunión");
    }
}
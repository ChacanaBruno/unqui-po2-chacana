package tpEjemploDeSolidAplicado;

public class Main {
    public static void main(String[] args) {
        ServidorPop servidor = new ServidorPop();
        ClienteEMail cliente = new ClienteEMail(servidor, servidor, servidor, "usuario@example.com", "password123");

        // Recibir correos nuevos
        cliente.recibirNuevos();
        System.out.println("Inbox tiene: " + cliente.inbox.size() + " correos");

        // Enviar un nuevo correo
        cliente.enviarCorreo("Revisión de Proyecto", "jefe@example.com", "Por favor revisa los últimos cambios.");
    }
}

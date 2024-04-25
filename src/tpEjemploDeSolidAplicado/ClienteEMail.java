package tpEjemploDeSolidAplicado;

import java.util.ArrayList;

/**
 * ClienteEMail utiliza inyección de dependencias para adherir al DIP.
 * Construido para ser flexible y desacoplado de implementaciones concretas del servidor de correo.
 */
public class ClienteEMail {
    IConexionServidor conexionServidor;
    IRecepcionCorreo recepcionCorreo;
    IEnvioCorreo envioCorreo;
    String nombreUsuario;
    String passusuario;
    ArrayList<Correo> inbox = new ArrayList<>();

    /**
     * Inyección de dependencias en el constructor para adherir al DIP.
     * Permite cambiar las implementaciones de servidor sin modificar el cliente (OCP).
     */
    public ClienteEMail(IConexionServidor conexion, IRecepcionCorreo recepcion, IEnvioCorreo envio, String nombreUsuario, String pass) {
        this.conexionServidor = conexion;
        this.recepcionCorreo = recepcion;
        this.envioCorreo = envio;
        this.nombreUsuario = nombreUsuario;
        this.passusuario = pass;
        this.conectar();
    }

    public void conectar() {
        this.conexionServidor.conectar(this.nombreUsuario, this.passusuario);
    }

    public void recibirNuevos() {
        this.inbox.addAll(this.recepcionCorreo.recibirNuevos(this.nombreUsuario, this.passusuario));
    }

    public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
        Correo correo = new Correo(asunto, destinatario, cuerpo);
        this.envioCorreo.enviar(correo);
    }
}
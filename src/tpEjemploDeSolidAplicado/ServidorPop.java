package tpEjemploDeSolidAplicado;

import java.util.ArrayList;
import java.util.List;

/**
 * ServidorPop implementa interfaces segregadas, permitiendo cumplir con ISP.
 * Adherencia a OCP permitiendo que la implementación sea extendida sin cambiar el código existente.
 */
public class ServidorPop implements IConexionServidor, IRecepcionCorreo, IEnvioCorreo {

    @Override
    public void conectar(String nombreUsuario, String passusuario) {
        System.out.println("Conectado al servidor POP como usuario: " + nombreUsuario);
    }

    @Override
    public List<Correo> recibirNuevos(String user, String pass) {
        System.out.println("Recibiendo nuevos correos para: " + user);
        List<Correo> nuevos = new ArrayList<>();
        nuevos.add(new Correo("Bienvenida", user, "¡Bienvenido a nuestro servicio!"));
        return nuevos;
    }

    @Override
    public void enviar(Correo correo) {
        System.out.println("Enviando correo a: " + correo.getDestinatario() + " con asunto: " + correo.getAsunto());
    }
}
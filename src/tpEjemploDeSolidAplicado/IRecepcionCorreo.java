package tpEjemploDeSolidAplicado;

import java.util.List;

/**
 * IRecepcionCorreo maneja la recepción de correos, también adheriendo al SRP.
 */
public interface IRecepcionCorreo {
    List<Correo> recibirNuevos(String user, String pass);
}
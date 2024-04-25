package tpEjemploDeSolidAplicado;

/**
 * IEnvioCorreo maneja el envío de correos, adheriendo al principio de responsabilidad única (SRP).
 */
public interface IEnvioCorreo {
    void enviar(Correo correo);
}

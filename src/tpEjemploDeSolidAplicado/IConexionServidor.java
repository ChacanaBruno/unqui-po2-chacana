package tpEjemploDeSolidAplicado;

/**
 * Segregación de Interfaces: Cada interfaz tiene una única responsabilidad específica (ISP).
 * IConexionServidor maneja la conexión con el servidor de correo.
 */
public interface IConexionServidor {
    void conectar(String nombreUsuario, String passusuario);
}
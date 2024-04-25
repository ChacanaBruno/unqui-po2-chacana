package tpEjemploDeSolidAplicado;
/**
 * Clase Correo que encapsula los datos de un correo electrónico, aplicando SRP.
 * Esta clase es un claro ejemplo de OCP, ya que es fácil de extender sin necesidad de modificarla.
 */
/**
 * Clase Correo diseñada para encapsular los detalles de un correo electrónico.
 * Sigue el Principio de Responsabilidad Única (SRP) al encargarse exclusivamente de almacenar los datos de un correo.
 * Cumple con el Principio Abierto/Cerrado (OCP) ya que permite extender sus funcionalidades sin modificar la clase existente.
 */
public class Correo {
    private String asunto;
    private String destinatario;
    private String cuerpo;

    /**
     * Constructor que inicializa un nuevo Correo con los detalles especificados.
     * @param asunto Asunto del correo.
     * @param destinatario Destinatario del correo.
     * @param cuerpo Texto del correo.
     */
    public Correo(String asunto, String destinatario, String cuerpo) {
        this.asunto = asunto;
        this.destinatario = destinatario;
        this.cuerpo = cuerpo;
    }

    /**
     * Retorna el asunto del correo.
     * @return Asunto del correo.
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Retorna el destinatario del correo.
     * @return Destinatario del correo.
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Retorna el cuerpo del correo.
     * @return Cuerpo del correo.
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /**
     * Establece un nuevo asunto para el correo.
     * @param asunto Nuevo asunto del correo.
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * Establece un nuevo destinatario para el correo.
     * @param destinatario Nuevo destinatario del correo.
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * Establece un nuevo cuerpo para el correo.
     * @param cuerpo Nuevo cuerpo del correo.
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
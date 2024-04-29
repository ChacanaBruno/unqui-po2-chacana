package ar.edu.unq.po2.TpSolidBancario;

public class Cliente {
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected int edad;
	protected double sueldoMensual;
	protected double sueldoAnual;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoMensual,
			double sueldoAnual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoMensual = sueldoMensual;
		this.sueldoAnual = sueldoAnual;
	}

	public void solicitarCreditoPersonalEnBanco(Banco banco) {
		// desarrollar logica

	}

}

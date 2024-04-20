package ar.edu.unq.po2.tp5;

public class Factura implements Pagable {
	protected double montoAPagar;
	
	Factura(){
		
	}


	public Factura(double montoAPagar) {
		super();
		this.montoAPagar = montoAPagar;
	}


	public double getMontoAPagar() {
		return montoAPagar;
	}


	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	} 
	
	public double notificarPrecio() {
		return montoAPagar;
	}

	
}

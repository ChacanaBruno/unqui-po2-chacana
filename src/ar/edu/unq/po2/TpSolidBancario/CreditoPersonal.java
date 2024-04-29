package ar.edu.unq.po2.TpSolidBancario;


public class CreditoPersonal extends Credito implements Verificable {

	public CreditoPersonal(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	public boolean realizarVerificacion(){
		return true;
	}

}
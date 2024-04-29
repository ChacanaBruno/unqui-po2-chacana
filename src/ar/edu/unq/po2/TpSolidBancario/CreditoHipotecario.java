package ar.edu.unq.po2.TpSolidBancario;

public class CreditoHipotecario extends Credito implements Verificable {

	public CreditoHipotecario(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	
	public boolean realizarVerificacion(){
		return true;
	}

	
}
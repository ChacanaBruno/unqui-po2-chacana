package ar.edu.unq.po2.TpSolidBancario;

public class Credito implements Verificable {
	protected Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Credito(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	


	@Override
	public boolean realizarVerificacion() {
		// TODO Auto-generated method stub
		return false;
	}
}

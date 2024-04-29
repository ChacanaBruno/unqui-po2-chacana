package ar.edu.unq.po2.TpSolidBancario;

import java.util.List;

public class Banco {
	public List<Cliente> clientesDelBanco;
	protected List<Verificable> solicitudesPenditeVerificaicon;

	public Banco(List<Cliente> clientesDelBanco) {
		super();
		this.clientesDelBanco = clientesDelBanco;
	}

	public Banco(List<Cliente> clientesDelBanco, List<Verificable> solicitudesPenditeVerificaicon) {
		super();
		this.clientesDelBanco = clientesDelBanco;
		this.solicitudesPenditeVerificaicon = solicitudesPenditeVerificaicon;
	}

	public List<Cliente> getClientesDelBanco() {
		return clientesDelBanco;
	}

	public void setClientesDelBanco(List<Cliente> clientesDelBanco) {
		this.clientesDelBanco = clientesDelBanco;
	}

	public void agregarCliente(Cliente cliente) {
		clientesDelBanco.add(cliente);

	}
}
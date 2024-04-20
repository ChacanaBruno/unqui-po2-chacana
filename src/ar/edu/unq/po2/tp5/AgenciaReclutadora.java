package ar.edu.unq.po2.tp5;

import java.util.List;

public class AgenciaReclutadora {
	private List<Factura> facturasPagadas;

	public List<Factura> getFacturasPagadas() {
		return facturasPagadas;
	}

	public void setFacturasPagadas(List<Factura> facturasPagadas) {
		this.facturasPagadas = facturasPagadas;
	}
	public	AgenciaReclutadora() {
		
	}
	public AgenciaReclutadora(List<Factura> facturasPagadas) {
		super();
		this.facturasPagadas = facturasPagadas;
	}

	
	public void recibirFacturaPagada(Factura factura) {
	facturasPagadas.add(factura);
	}
}

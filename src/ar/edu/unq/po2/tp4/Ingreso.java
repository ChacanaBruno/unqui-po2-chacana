package ar.edu.unq.po2.tp4;

class Ingreso {
    protected String mes;
    protected String concepto;
    protected double monto;

    public Ingreso(String mes, String concepto, double monto) {
        this.mes = mes;
        this.concepto = concepto;
        this.monto = monto;
    }

    public double getMontoImponible() {
        return monto;
    }
}

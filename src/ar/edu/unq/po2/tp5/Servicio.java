package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
    private double costoPorUnidad;
    private int unidadesConsumidas;
   

    public Servicio(double costoPorUnidad, int unidadesConsumidas) {
        this.costoPorUnidad = costoPorUnidad;
        this.unidadesConsumidas = unidadesConsumidas;
        calcularMontoAPagar();
    }

    private void calcularMontoAPagar() {
        montoAPagar = costoPorUnidad * unidadesConsumidas;  // Cálculo específico para Impuesto
    }

    public double getCostoPorUnidad() {
        return costoPorUnidad;
    }

    public void setCostoPorUnidad(double costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
        calcularMontoAPagar();  // Recalcular cuando se cambia el costo
    }

    public int getUnidadesConsumidas() {
        return unidadesConsumidas;
    }

    public void setUnidadesConsumidas(int unidadesConsumidas) {
        this.unidadesConsumidas = unidadesConsumidas;
        calcularMontoAPagar();  // Recalcular cuando cambian las unidades
    }

}

package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
    private double tasaDeServicio;

    public Impuesto(double tasaDeServicio) {
        this.tasaDeServicio = tasaDeServicio;
        calcularMontoAPagar();
    }

    private void calcularMontoAPagar() {
        montoAPagar = tasaDeServicio; // Directamente igual a la tasa de servicio
    }

    public double getTasaDeServicio() {
        return tasaDeServicio;
    }

    public void setTasaDeServicio(double tasaDeServicio) {
        this.tasaDeServicio = tasaDeServicio;
        calcularMontoAPagar(); // Recalcular cuando se cambia la tasa
    }
}

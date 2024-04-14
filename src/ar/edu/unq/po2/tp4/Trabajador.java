package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

/**
 * El Impuesto al Trabajador es un impuesto que pagan anualmente todos los
 * trabajadores del país. El monto a pagar del impuesto es un 2% del total del
 * monto imponible de los ingresos del trabajador. De cada trabajador se
 * registran sus ingresos percibidos del año. De cada ingreso se conoce el mes
 * de percepción, el concepto y el monto percibido. Existe un tipo de ingreso,
 * el Ingreso por Horas Extras, del cual se conoce además la cantidad de horas
 * extras realizadas, por las cuales el trabajados percibió tal ingreso. Para un
 * ingreso, el monto imponible al Impuesto al Trabajador es igual al monto
 * percibido. Sin embargo, los ingresos por horas extras están exentos al
 * impuesto. Es decir, suman cero al total del monto imponible al impuesto al
 * trabajador. La solución debe respetar el siguiente protocolo:
 * Trabajador>>getTotalPercibido() //retornar el monto total percibido por el
 * trabajador Java para programadores objetosos (subida al classroom) Lectura
 * sugerida Obra publicada con Licencia Creative Commons Reconocimiento
 * Compartir igual 4.0 Trabajador>>getMontoImponible() //retornar el monto
 * imponible al impuesto al trabajador Trabajador>>getImpuestoAPagar()
 * //retornar el monto a pagar por el trabajador, calculado como el 2% del monto
 * imponible
 */
class Trabajador {
    private List<Ingreso> ingresos = new ArrayList<>();

    public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }

    public double getTotalPercibido() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.monto;
        }
        return total;
    }

    public double getMontoImponible() {
        double montoImponible = 0;
        for (Ingreso ingreso : ingresos) {
            montoImponible += ingreso.getMontoImponible();
        }
        return montoImponible;
    }

    public double getImpuestoAPagar() {
        return getMontoImponible() * 0.02; // 2% del monto imponible
    }
}
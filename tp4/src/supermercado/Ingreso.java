package supermercado;

public class Ingreso {

    private int mesPercepcion;

    private String concepto;

    private double montoPercibido;

    public Ingreso(int mesPercepcion, String concepto, double montoPercibido) {
        super();
        this.mesPercepcion = mesPercepcion;
        this.concepto = concepto;
        this.montoPercibido = montoPercibido;
    }

    public int getMesPercepcion() {
        return mesPercepcion;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getMontoPercibido() {
        return montoPercibido;
    }

    public double getMontoImponible() {
        return getMontoPercibido();
    }

}

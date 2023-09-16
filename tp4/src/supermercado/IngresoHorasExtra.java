package supermercado;

public class IngresoHorasExtra extends Ingreso{

    private int horasExtra;

    public IngresoHorasExtra(int mesPercepcion, String concepto, double montoPercibido, int horasExtra) {
        super(mesPercepcion, concepto, montoPercibido);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    @Override
    public double getMontoImponible() {
        return 0;
    }

}
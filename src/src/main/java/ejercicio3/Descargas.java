package ejercicio3;

public class Descargas extends PlanDeco {
    public Descargas (Plan plan) {
        super(plan);
    }

    @Override
    public int getCosto() {
        // suma 700 al costo del plan que envuelve
        return super.getCosto() + 700;
    }

    @Override
    public String getNombre() {
        // agrega " + Descargas" al nombre del plan
        return super.getNombre() + " + Descargas";
    }
}



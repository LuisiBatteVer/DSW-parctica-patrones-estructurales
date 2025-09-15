package ejercicio3;

public class HD extends PlanDeco {
    public HD(Plan plan) {
        super(plan);
    }

    @Override
    public int getCosto() {
        // suma 500 al costo del plan que envuelve
        return super.getCosto() + 500;
    }

    @Override
    public String getNombre() {
        // agrega " + HD" al nombre del plan
        return super.getNombre() + " + HD";
    }
}

package decorator;

public class UltraHD extends PlanDeco{
    public UltraHD(Plan plan) {
        super(plan);
    }
    @Override
    public int getCosto() {
        // suma 1000 al costo del plan que envuelve
        return super.getCosto() + 1000;
    }

    @Override
    public String getNombre() {
        // agrega " + UltraHD" al nombre del plan
        return super.getNombre() + " + UltraHD";
    }

}

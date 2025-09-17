package decorator;
//componente concreto, sobre este se agregan las mejoras
public class PlanBasico implements Plan {
    @Override
    public int getCosto() {
        return 1000;
    }

    @Override
    public String getNombre() {
        return "Plan Básico";
    }
}

package decorator;

public abstract class PlanDeco implements Plan {
    protected final Plan plan;

    public PlanDeco(Plan plan) {
        this.plan = plan; // ← aca guarda el plan base, por eso es PlanBasico + lo otro
    }

    @Override
    public int getCosto() {
        return plan.getCosto();
    }

    @Override
    public String getNombre() {
        return plan.getNombre();
    }
}

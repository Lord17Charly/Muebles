package impl.concreteProducts.Victoriano;

import base.factories.products.IMesa;

public class MesaVictoriana implements IMesa {

    private int objetosMesa;

    public MesaVictoriana() {
        this.objetosMesa = 0;
    }

    @Override
    public void colocarCosas(int cosas) {
        this.objetosMesa = cosas;
        System.out.println("Se colocaron " + this.objetosMesa + " objetos en la mesa");
    }

    @Override
    public String getEstilo() {
        return "Mesa Estilo Victoriano";
    }

    @Override
    public int getNoCosas() {
        return this.objetosMesa;
    }
}

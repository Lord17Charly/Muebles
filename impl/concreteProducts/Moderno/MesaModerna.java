package impl.concreteProducts.Moderno;

import base.factories.products.IMesa;

public class MesaModerna implements IMesa {

    private int objetosMesa;

    public MesaModerna() {
        this.objetosMesa = 0;
    }

    @Override
    public void colocarCosas(int cosas) {
        this.objetosMesa = cosas;
        System.out.println("Se colocaron " + this.objetosMesa + " objetos en la mesa");
    }

    @Override
    public String getEstilo() {
        return "Mesa Estilo Moderno";
    }

    @Override
    public int getNoCosas() {
        return this.objetosMesa;
    }
}


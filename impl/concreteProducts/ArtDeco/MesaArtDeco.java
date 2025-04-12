package impl.concreteProducts.ArtDeco;

import base.factories.products.IMesa;

public class MesaArtDeco implements IMesa {

    private int objetosMesa;

    public MesaArtDeco() {
        this.objetosMesa = 0;
    }

    @Override
    public void colocarCosas(int cosas) {
        this.objetosMesa = cosas;
        System.out.println("Se colocaron " + this.objetosMesa + " objetos en la mesa");
    }

    @Override
    public String getEstilo() {
        return "Mesa Estilo ArtDeco";
    }

    @Override
    public int getNoCosas() {
        return this.objetosMesa;
    }
}

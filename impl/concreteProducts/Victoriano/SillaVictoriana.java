package impl.concreteProducts.Victoriano;

import base.factories.products.ISilla;

public class SillaVictoriana implements ISilla {

    @Override
    public void sentarse() {
        System.out.println("Sentado en silla Victoriana");
    }

    @Override
    public String getEstilo() {
        return "Silla Estilo Victoriano";
    }
}

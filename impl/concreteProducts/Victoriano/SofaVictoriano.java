package impl.concreteProducts.Victoriano;

import base.factories.products.ISofa;

public class SofaVictoriano implements ISofa {

    @Override
    public void recostarse() {
        System.out.println("Recostado en el Sofá Victoriano");
    }

    @Override
    public String getEstilo() {
        return "Sofá Estilo Victoriano";
    }
}

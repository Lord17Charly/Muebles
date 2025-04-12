package impl.concreteProducts.Moderno;

import base.factories.products.ISofa;

public class SofaModerno implements ISofa {

    @Override
    public void recostarse() {
        System.out.println("Recostado en el Sofá Moderno");
    }

    @Override
    public String getEstilo() {
        return "Sofá Estilo Moderno";
    }
}

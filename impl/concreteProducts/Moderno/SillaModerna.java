package impl.concreteProducts.Moderno;

import base.factories.products.ISilla;

public class SillaModerna implements ISilla {

    @Override
    public void sentarse() {
        System.out.println("Sentado en silla Moderna");
    }

    @Override
    public String getEstilo() {
        return "Silla Estilo Moderno";
    }
}

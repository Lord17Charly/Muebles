package impl.concreteProducts.ArtDeco;

import base.factories.products.ISilla;

public class SillaArtDeco implements ISilla {

    @Override
    public void sentarse() {
        System.out.println("Sentado en silla ArtDeco");
    }

    @Override
    public String getEstilo() {
        return "Silla Estilo ArtDeco";
    }
}

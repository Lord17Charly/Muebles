package impl.concreteProducts.ArtDeco;

import base.factories.products.ISofa;

public class SofaArtDeco implements ISofa {

    @Override
    public void recostarse() {
        System.out.println("Recostado en el Sofá");
    }

    @Override
    public String getEstilo() {
        return "Sofá Estilo ArtDeco";
    }
}

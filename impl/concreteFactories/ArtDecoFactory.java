package impl.concreteFactories;

import base.factories.IFabricaMuebles;
import base.factories.products.IMesa;
import base.factories.products.ISilla;
import base.factories.products.ISofa;
import impl.concreteProducts.ArtDeco.MesaArtDeco;
import impl.concreteProducts.ArtDeco.SillaArtDeco;
import impl.concreteProducts.ArtDeco.SofaArtDeco;

public class ArtDecoFactory implements IFabricaMuebles {

    @Override
    public ISilla crearSilla() {
        return new SillaArtDeco();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaArtDeco();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaArtDeco();
    }
}

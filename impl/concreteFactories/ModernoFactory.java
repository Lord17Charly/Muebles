package impl.concreteFactories;

import base.factories.IFabricaMuebles;
import base.factories.products.IMesa;
import base.factories.products.ISilla;
import base.factories.products.ISofa;
import impl.concreteProducts.Moderno.MesaModerna;
import impl.concreteProducts.Moderno.SillaModerna;
import impl.concreteProducts.Moderno.SofaModerno;

public class ModernoFactory implements IFabricaMuebles {

    @Override
    public ISilla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaModerno();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaModerna();
    }
}

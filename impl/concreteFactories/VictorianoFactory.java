package impl.concreteFactories;

import base.factories.IFabricaMuebles;
import base.factories.products.IMesa;
import base.factories.products.ISilla;
import base.factories.products.ISofa;
import impl.concreteProducts.Victoriano.MesaVictoriana;
import impl.concreteProducts.Victoriano.SillaVictoriana;
import impl.concreteProducts.Victoriano.SofaVictoriano;

public class VictorianoFactory implements IFabricaMuebles {

    @Override
    public ISilla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public ISofa crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaVictoriana();
    }
}

package base.factories;

import base.factories.products.IMesa;
import base.factories.products.ISilla;
import base.factories.products.ISofa;

public interface IFabricaMuebles {
    ISilla crearSilla();
    ISofa crearSofa();
    IMesa crearMesa();
}



import base.factories.IFabricaMuebles;
import base.factories.products.IMesa;
import base.factories.products.ISilla;
import base.factories.products.ISofa;
import impl.concreteFactories.ArtDecoFactory;
import impl.concreteFactories.ModernoFactory;
import impl.concreteFactories.VictorianoFactory;

public class Principal {
    public static void main(String[] args) {
        System.out.println("==== FABRICA DE MUEBLES ====");

        // Usamos la fábrica ArtDeco
        IFabricaMuebles fabrica = new ArtDecoFactory();
        ISilla silla = fabrica.crearSilla();
        ISofa sofa = fabrica.crearSofa();
        IMesa mesa = fabrica.crearMesa();

        System.out.println("\n------ Creando Estilo ArtDeco ------");
        silla.sentarse();
        System.out.println(silla.getEstilo());
        sofa.recostarse();
        System.out.println(sofa.getEstilo());
        mesa.colocarCosas(3);
        System.out.println(mesa.getEstilo());

        // Usamos la fábrica Moderno
        System.out.println("\n------ Creando Estilo Moderno ------");
        fabrica = new ModernoFactory();
        silla = fabrica.crearSilla();
        sofa = fabrica.crearSofa();
        mesa = fabrica.crearMesa();

        silla.sentarse();
        System.out.println(silla.getEstilo());
        sofa.recostarse();
        System.out.println(sofa.getEstilo());
        mesa.colocarCosas(5);
        System.out.println(mesa.getEstilo());

        // Usamos la fábrica Victoriano
        System.out.println("\n------ Creando Estilo Victoriano ------");
        fabrica = new VictorianoFactory();
        silla = fabrica.crearSilla();
        sofa = fabrica.crearSofa();
        mesa = fabrica.crearMesa();

        silla.sentarse();
        System.out.println(silla.getEstilo());
        sofa.recostarse();
        System.out.println(sofa.getEstilo());
        mesa.colocarCosas(7);
        System.out.println(mesa.getEstilo());
    }
}



import java.util.Scanner;

import base.factories.IFabricaMuebles;
import base.factories.products.IMesa;
import base.factories.products.ISilla;
import base.factories.products.ISofa;
import impl.concreteFactories.ArtDecoFactory;
import impl.concreteFactories.ModernoFactory;
import impl.concreteFactories.VictorianoFactory;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        
        do {
            mostrarMenu();
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
                continue; // Repite el menú
            }
            
            IFabricaMuebles fabrica = null;
            switch(opcion) {
                case 1:
                    fabrica = new ArtDecoFactory();
                    break;
                case 2:
                    fabrica = new ModernoFactory();
                    break;
                case 3:
                    fabrica = new VictorianoFactory();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            
            if (fabrica != null) {
                procesarFabrica(fabrica);
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    // Muestra el menú de opciones
    private static void mostrarMenu() {
        System.out.println("==== MENU DE FABRICAS DE MUEBLES ====");
        System.out.println("1. Muebles Estilo ArtDeco");
        System.out.println("2. Muebles Estilo Moderno");
        System.out.println("3. Muebles Estilo Victoriano");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }
    
    // Método que encapsula el código repetido para crear y procesar los muebles
    private static void procesarFabrica(IFabricaMuebles fabrica) {
        // Se crean los productos usando la fábrica proporcionada.
        ISilla silla = fabrica.crearSilla();
        ISofa sofa = fabrica.crearSofa();
        IMesa mesa = fabrica.crearMesa();
        
        System.out.println("\n------ Creando muebles con la fábrica: " + extraerEstilo(silla.getEstilo()) + " ------");
        
        // Procesa la Silla
        silla.sentarse();
        System.out.println("Estilo: " + silla.getEstilo());
        
        // Procesa el Sofá
        sofa.recostarse();
        System.out.println("Estilo: " + sofa.getEstilo());
        
        // Procesa la Mesa; para este ejemplo se colocan objetos de forma distinta según el estilo,
        // pero esto puede hacerse interactivo o parametrizado.
        int objetos = determinarObjetos(silla.getEstilo());
        mesa.colocarCosas(objetos);
        System.out.println("Estilo: " + mesa.getEstilo());
        
        System.out.println("------------------------------------------\n");
    }
    
    // Método auxiliar para extraer el nombre del estilo (ejemplo: "Silla Estilo ArtDeco" -> "ArtDeco")
    private static String extraerEstilo(String descripcion) {
        String[] partes = descripcion.split(" ");
        return partes[partes.length - 1];
    }
    
    // Método auxiliar para determinar el número de objetos a colocar en la mesa según el estilo.
    // Aquí se usa una lógica simple; podrías hacerla más compleja o leerla de la entrada si se desea.
    private static int determinarObjetos(String estilo) {
        if (estilo.contains("ArtDeco")) {
            return 3;
        } else if (estilo.contains("Moderno")) {
            return 5;
        } else if (estilo.contains("Victoriano")) {
            return 7;
        }
        return 0;
    }
}

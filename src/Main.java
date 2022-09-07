

/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TArbolBB<Integer> arbol = new TArbolBB<>();

        for (String clave : ManejadorArchivosGenerico.leerArchivo("claves.txt")) {
            var valor = Integer.parseInt(clave);
            arbol.insertar(new TElementoAB<Integer>(valor, valor));
        }

	System.out.println("PREORDEN: " + arbol.preOrden());
	System.out.println("ENORDEN: " + arbol.inOrden());
    }
}

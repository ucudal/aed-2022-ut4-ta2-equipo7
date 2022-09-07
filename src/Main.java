
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

        for (String linea : ManejadorArchivosGenerico.leerArchivo("consultaPrueba.txt")) {
            Comparable etiqueta = Integer.parseInt(linea);
            System.out.println("Clave: " + etiqueta);
            if (arbol.buscar(etiqueta) == null) {
                System.out.println("Clave no encontrada");
            } else {
                System.out.println("Clave encontrada");

            }
        }

        System.out.println("PREORDEN: " + arbol.preOrden());
        System.out.println("ENORDEN: " + arbol.inOrden());
    }
}

public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

	@Override
	public boolean insertar(TElementoAB<T> unElemento) {
		if (raiz == null) {
			raiz = unElemento;
			System.out.println("Contador insertar(): 0");
			return true;
		} else {
			return raiz.insertar(unElemento);
		}
	}

	@Override
	public TElementoAB<T> buscar(Comparable unaEtiqueta) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public String preOrden() {
		if (raiz != null) {
			return raiz.preOrden();
		} else {
			return "";
		}
	}

	@Override
	public String inOrden() {
		if (raiz != null) {
			return raiz.inOrden();
		} else {
			return "";
		}
	}

	@Override
	public String postOrden() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void eliminar(Comparable unaEtiqueta) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

       }

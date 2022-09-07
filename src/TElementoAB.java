public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    private static int invInsertar = 0;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }

    public void setHijoIzq(TElementoAB<T> elemento) {
         hijoIzq = elemento;
    }

    public void setHijoDer(TElementoAB<T> elemento) {
         hijoDer = elemento;
    }

    public T getDatos() {
        return datos;
    }

    public boolean insertar(TElementoAB<T> elemento) {
        invInsertar += 1;

        int comp = elemento.getEtiqueta().compareTo(etiqueta);
        if (comp < 0) {
            if (hijoIzq != null) {
                return hijoIzq.insertar(elemento);
            } else {
                hijoIzq = elemento;
                System.out.println("Contador insertar(): " + invInsertar);
                invInsertar = 0;
                return true;
            }
        } else if (comp > 0) {
             if (hijoDer != null) {
                return hijoDer.insertar(elemento);
            } else {
                hijoDer = elemento;
                System.out.println("Contador insertar(): " + invInsertar);
                invInsertar = 0;
                return true;
            }
        } else {
			System.out.println("Contador insertar(): " + invInsertar);
            invInsertar = 0;
            return false;
        }
    }

	@Override
	public TElementoAB<T> buscar(Comparable unaEtiqueta) {
		if (getEtiqueta().compareTo(unaEtiqueta) == 0){
                    return this;
                }
                if(getHijoIzq() != null && getEtiqueta().compareTo(unaEtiqueta) < 0){
                    return getHijoIzq().buscar(unaEtiqueta);
                } else if(getHijoDer() != null && getEtiqueta().compareTo(unaEtiqueta) > 0){
                    return getHijoDer().buscar(unaEtiqueta);
                }
                return null;
	}

	@Override
	public String preOrden() {
        String resultado = etiqueta.toString();

        if (hijoIzq != null) {
            resultado += " - " + hijoIzq.preOrden();
        }

        if (hijoDer != null) {
            resultado += " - " + hijoDer.preOrden();
        }

        return resultado;
	}

	@Override
	public String inOrden() {
        String resultado = "";

        if (hijoIzq != null) {
            resultado = hijoIzq.inOrden();

            if (resultado != "") {
                resultado += " - ";
            }
        }

        resultado += etiqueta.toString();

        if (hijoDer != null) {
            String der = hijoDer.inOrden();

            if (der != "") {
                resultado += " - " + der;
            }
        }

        return resultado;
	}

	@Override
	public String postOrden() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public TElementoAB eliminar(Comparable unaEtiqueta) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}

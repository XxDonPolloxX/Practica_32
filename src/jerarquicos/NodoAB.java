package jerarquicos;

public class NodoAB<E> {
    private NodoAB<E> izq;
    private NodoAB<E> der;
    private E dato;
    private int tamanyo;
    public NodoAB(NodoAB<E> izq, NodoAB<E> der, E dato){
        this.dato = dato;
        this.izq = izq;
        this.der = der;
        tamanyo=1;
        if(izq!=null){
            tamanyo+= izq.tamanyo;
        }
        if(der!=null){
            tamanyo+= der.tamanyo;
        }
    }
    public NodoAB<E> getIzq() {return izq;}

    public NodoAB<E> getDer() {return der;}

    public E getDato() {return dato;}

    public int getTamanyo() {
        return tamanyo;
    }
}

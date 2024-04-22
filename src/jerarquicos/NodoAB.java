package jerarquicos;

public class NodoAB<E> {
    private NodoAB<E> izq;
    private NodoAB<E> der;
    private E dato;
    public NodoAB(NodoAB<E> izq, NodoAB<E> der, E dato){
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }
    public NodoAB<E> getIzq() {return izq;}

    public NodoAB<E> getDer() {return der;}

    public E getDato() {return dato;}
}

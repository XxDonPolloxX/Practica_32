import jerarquicos.AB;
import jerarquicos.NodoAB;

public class Main {
    public static void main(String[] args) {
        NodoAB<Integer> p, a, c, o, d;
        p= new NodoAB<Integer>(null,null, 8);
        a = new NodoAB<Integer>(null, p, 5);
        d= new NodoAB<Integer>(null, null, 9);
        p = new NodoAB<Integer>(null, null, 7);
        c = new NodoAB<Integer>(d, p, 6);
        o= new NodoAB<Integer>(c, a, 2);
        AB<Integer> arbol = new AB<Integer>(o);
        System.out.println(arbol.listadoInOrden());
    }
}
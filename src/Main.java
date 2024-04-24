import jerarquicos.AB;
import jerarquicos.NodoAB;

public class Main {
    public static void main(String[] args) {
        NodoAB<Integer> p, a, c, o, d;
        p= new NodoAB<Integer>(null,null, 3);
        a = new NodoAB<Integer>(p, null, 5);
        c= new NodoAB<Integer>(null, a, 9);
        d= new NodoAB<Integer>(null, null, -2);
        o= new NodoAB<Integer>(d, c, 10);
        AB<Integer> arbol = new AB<Integer>(o);
        System.out.println(arbol.listadoInOrdenConverso());
    }
}
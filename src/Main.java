import jerarquicos.AB;
import jerarquicos.ABEnteros;
import jerarquicos.NodoAB;

public class Main {
    public static void main(String[] args) {
        NodoAB<Integer> n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        n1 = new NodoAB<Integer>(null, null, 2);
        n2 = new NodoAB<Integer>(null, null, 2);
        n3 = new NodoAB<Integer>(n1, n2, 4);
        n4 = new NodoAB<Integer>(null, null, 8);
        n5 = new NodoAB<Integer>(n4, n3, 12);
        n6 = new NodoAB<Integer>(null, null, 0);
        n7 = new NodoAB<Integer>(n6, null, -3);
        n8 = new NodoAB<Integer>(null, null, -3);
        n9 = new NodoAB<Integer>(n7, n8, 34);
        n10 = new NodoAB<Integer>(n5, n9, 13);
        ABEnteros<Integer> arbol = new ABEnteros<Integer>(n10);
        System.out.println(arbol.sumaNodosNiveles(1, 3));
    }
}
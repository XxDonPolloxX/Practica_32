import jerarquicos.NodoAB;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NodoAB<Integer> p, a, c, o;
        p= new NodoAB<Integer>(null,null, 3);
        a = new NodoAB<Integer>(p, null, 5);
        c= new NodoAB<Integer>(null, a, 9);
        o= new NodoAB<Integer>(null, c, 10);
        System.out.println(o.getTamanyo());

    }
}
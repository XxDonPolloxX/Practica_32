package jerarquicos;

public class ABEnteros<Integer> extends AB{
    public ABEnteros(NodoAB raiz) {
        super(raiz);
    }

    public boolean comprobarSumas(NodoAB<Integer> nodo){
        int sumaDer, sumaIzq;

    }
    public int sumarArboles(NodoAB<Integer> nodo){

    }

    public boolean comprobarClavePequeña(){
        if(raiz == null){
            return true;
        }
        return comprobarClavePequeña(raiz);
    }
    private boolean comprobarClavePequeña(NodoAB<Integer> nodo){
        boolean menor = true;
        if(nodo != null){
           //if (nodo.getIzq().getDato() < nodo.getDato()){

           }
        }
    }
}

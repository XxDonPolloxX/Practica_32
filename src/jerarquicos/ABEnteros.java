package jerarquicos;

public class ABEnteros<Integer> extends AB{
    public ABEnteros(NodoAB raiz) {
        super(raiz);
    }
    public boolean comprobarSumas(){
        int sumaDer, sumaIzq;
        if(raiz.getDer()==null){
            sumaDer=0;
        }
        else{sumaDer=sumarArboles(raiz.getDer());}
        if(raiz.getIzq()==null){
            sumaIzq=0;
        }
        else{sumaIzq=sumarArboles(raiz.getIzq());}
        if(raiz.getDer()==null && raiz.getIzq()==null){
            return true;
        }
        if(sumaIzq==sumaDer && comprobarSumas(raiz.getDer()) && comprobarSumas(raiz.getIzq())){
            return true;
        }
        else {
            return false;
        }
    }
    private boolean comprobarSumas(NodoAB<Integer> nodo){
        int sumaDer, sumaIzq;
        if(nodo==null){
            return true;
        }
        if(nodo.getDer()==null){
            sumaDer=0;
        }
        else{sumaDer=sumarArboles(nodo.getDer());}
        if(nodo.getIzq()==null){
            sumaIzq=0;
        }
        else{sumaIzq=sumarArboles(nodo.getIzq());}
        if(nodo.getDer()==null && nodo.getIzq()==null){
            return true;
        }
        if(sumaIzq==sumaDer && comprobarSumas(nodo.getDer()) && comprobarSumas(nodo.getIzq())){
            return true;
        }
        else {
            return false;
        }

    }
    public int sumarArboles(NodoAB<Integer> nodo){
        int suma;
        suma= (int) nodo.getDato();
        if(nodo.getIzq()!=null){
            suma+=sumarArboles(nodo.getIzq());
        }
        if(nodo.getDer()!=null){
            suma+=sumarArboles(nodo.getDer());
        }
        return suma;
    }

    public boolean comprobarClavePequenia(){
        if(raiz == null){
            return true;
        }
        return comprobarClavePequenia(raiz);
    }
    private boolean comprobarClavePequenia(NodoAB<Integer> nodo){
        boolean menor = false;
        if(nodo != null){
            if ((int)nodo.getDato() < (int)nodo.getIzq().getDato()){
                menor = true;
            }
            if ((int)nodo.getDato() < (int)nodo.getDer().getDato()){
                menor = true;
            }
            if (comprobarClavePequenia(nodo.getIzq()) && comprobarClavePequenia(nodo.getDer())){
                menor = true;
            }
        }
        return menor;
    }
}

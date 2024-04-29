package jerarquicos;

public class ABEnteros<Integer> extends AB{
    public ABEnteros(NodoAB raiz) {
        super(raiz);
    }
    public boolean comprobarSumas(){
        int sumaDer, sumaIzq;
        if(raiz==null){
            return true;
        }
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
    private boolean comprobarClavePequenia(NodoAB<Integer> nodo) {
        if (nodo == null) {
            return true;
        }
        if (nodo.getIzq() != null && (int) nodo.getDato() > (int) nodo.getIzq().getDato()) {
            return false;
        }

        if (nodo.getDer() != null && (int) nodo.getDato() > (int) nodo.getDer().getDato()) {
            return false;
        }
        return comprobarClavePequenia(nodo.getIzq()) && comprobarClavePequenia(nodo.getDer());
    }
    public int sumaNodosNiveles(int K1, int K2){
        int suma=0;
        if(esVacio()){
            return 0;
        }
        suma += sumaNodosNiveles(K1, K2, raiz.getDer(), 1);
        suma += sumaNodosNiveles(K1, K2, raiz.getIzq(), 1);
        return + suma;
    }
    private int sumaNodosNiveles(int K1, int K2, NodoAB<Integer> nodo, int K){
        int suma=0;
        if(nodo==null){
            return 0;
        }
        if(K>=K1 && K<=K2){
            K++;
            suma = (int)nodo.getDato();
            suma+=sumaNodosNiveles(K1, K2, nodo.getDer(), K) + sumaNodosNiveles(K1, K2, nodo.getIzq(), K);
        }
        return suma;
    }

    public String mostrarAscendientes(int dato){
        String res = mostrarAscendientes(dato, raiz);
        if(res.isEmpty()){
            return "No se ha encontrado el nodo";
        }
        return res;
    }
    public String mostrarAscendientes(int dato, NodoAB<Integer> nodo){
        if(nodo==null){
            return "";
        }
        if((int)nodo.getDato()==dato){
            return nodo.getDato().toString();
        }
        String izq = mostrarAscendientes(dato, nodo.getIzq());
        String der = mostrarAscendientes(dato, nodo.getDer());

        if(!izq.isEmpty()){
            return izq + " " + nodo.getDato().toString();
        }
        if(!der.isEmpty()){
            return der + " " + nodo.getDato().toString();
        }
        return "";
    }

    public int numeroNodosImpares(int nivel){
        if (esVacio()){
            return 0;
        }
        return numeroNodosImpares(nivel, raiz);
    }

    private int numeroNodosImpares(int nivel, NodoAB<Integer> nodo){
        if(nodo==null){
            return 0;
        }
        if(nivel==0){
            if((int)nodo.getDato()%2!=0){
                return 1;
            }
            else{
                return 0;
            }
        }
        return numeroNodosImpares(nivel-1, nodo.getIzq()) + numeroNodosImpares(nivel-1, nodo.getDer());
    }
}

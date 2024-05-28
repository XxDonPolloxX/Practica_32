package jerarquicos;

import modelos.I_AB;

public class AB <E> implements I_AB<E> {
    protected NodoAB<E> raiz;
    public AB(NodoAB<E> raiz){
        this.raiz=raiz;
    }
    public boolean esVacio(){
        if(raiz==null){
            return true;
        }
        else{
            return false;
        }
    }

    public NodoAB<E> getRaiz() {
        return raiz;
    }


    public String listadoInOrden(){

        if(raiz==null){
            return "";
        }
        return listadoInOrden(raiz);
    }

    protected String listadoInOrden(NodoAB<E> nodo){
        String res = "";
        if(nodo != null){
            res = listadoInOrden(nodo.getIzq());
            res += nodo.getDato().toString() + " ";
            res += listadoInOrden(nodo.getDer());
        }
        return res;
    }

    public String listadoInOrdenConverso(){
        if (raiz == null){
            return "";
        }
        return listadoInOrdenConverso(raiz);
    }

    protected String listadoInOrdenConverso(NodoAB<E> nodo){
        String res = "";
        if(nodo != null){
            res = listadoInOrdenConverso(nodo.getDer());
            res += nodo.getDato().toString() + " ";
            res += listadoInOrdenConverso(nodo.getIzq());
        }
        return res;
    }

    public String listadoPreOrden(){
        String res;
        if(raiz==null){
            return "Arbol Vacío";
        }
        else {
            res = raiz.getDato().toString();
            if (raiz.getIzq() != null) {
                res += " " + listadoPreOrden(raiz.getIzq());
            }
            if (raiz.getDer() != null) {
                res += " " + listadoPreOrden(raiz.getDer());
            }
            return res;
        }
    }
    protected String listadoPreOrden(NodoAB<E> nodo){
        String res;
        res= nodo.getDato().toString();
        if(nodo.getIzq()!=null){
            res+= " " + listadoPreOrden(nodo.getIzq());
        }
        if(nodo.getDer()!=null){
            res+= " " + listadoPreOrden(nodo.getDer());
        }
        return res;
    }
    public String listadoPostOrden(){
        String res="";
        if(raiz==null){
            return "Arbol Vacío";
        }
        if(raiz.getIzq()!=null){
            res+=listadoPostOrden(raiz.getIzq()) + " ";
        }
        if(raiz.getDer()!=null){
            res+=listadoPostOrden(raiz.getDer()) + " ";
        }
        res+=raiz.getDato().toString();
        return res;
    }
    protected String listadoPostOrden(NodoAB<E> nodo){
        String res="";
        if(nodo.getIzq()!=null){
            res+=listadoPostOrden(nodo.getIzq()) + " ";
        }
        if(nodo.getDer()!=null){
            res+=listadoPostOrden(nodo.getDer()) + " ";
        }
        res+=nodo.getDato().toString() + " ";
        return res;
    }
    public void vaciarArbolSinRecorrer(){
        raiz=null;
    }
    public void vaciarArbolRecorriendo(){
        vaciarArbolRecorriendo(raiz.getDer());
        vaciarArbolRecorriendo(raiz.getIzq());
        raiz.setDer(null);
        raiz.setIzq(null);
        raiz=null;
    }
    public void vaciarArbolRecorriendo(NodoAB<E> nodo){
        if(nodo.getDer()!=null){
            vaciarArbolRecorriendo(nodo.getDer());
        }
        if(nodo.getIzq()!=null){
            vaciarArbolRecorriendo(nodo.getIzq());
        }
        nodo.setIzq(null);
        nodo.setDer(null);
    }




}

package jerarquicos;

public class AB <E>{
    private NodoAB<E> raiz;
    public AB(NodoAB<E> raiz){
        this.raiz=raiz;
    }

    public String listadoInOrden(){
        if(raiz==null){
            return "";
        }
        return listadoInOrden(raiz);
    }
    private String listadoInOrden(NodoAB<E> nodo){
        String res = "";
        if(nodo != null){
            res = listadoInOrden(nodo.getIzq());
            res += nodo.getDato().toString();
            res += listadoInOrden(nodo.getDer());
        }
        return res;
    }

    public String listadoInOrdenConverso(){
        if (raiz != null){
            return "";
        }
        return listadoInOrdenConverso(raiz);
    }

    private String listadoInOrdenConverso(NodoAB<E> nodo){
        String res = null;
        if (nodo != null){
            res = listadoInOrdenConverso(nodo.getDer());
            res += nodo.getDato().toString();
            res += listadoInOrdenConverso(nodo.getIzq());
        }
        return res;
    }



}

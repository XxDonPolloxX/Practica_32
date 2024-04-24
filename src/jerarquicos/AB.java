package jerarquicos;

public class AB <E>{
    protected NodoAB<E> raiz;
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

    private String listadoInOrdenConverso(NodoAB<E> nodo){
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
    private String listadoPreOrden(NodoAB<E> nodo){
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
    private String listadoPostOrden(NodoAB<E> nodo){
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




}

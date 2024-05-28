package modelos;

import jerarquicos.NodoAB;

public interface I_ABEnteros <Integer> extends I_AB{
    boolean comprobarSumas();
    boolean comprobarClavePequenia();
    int sumarArboles(NodoAB<Integer> nodo);
    int sumaNodosNiveles(int K1, int K2);
    String mostrarAscendientes(int dato);
    int numeroNodosImpares(int nivel);

}

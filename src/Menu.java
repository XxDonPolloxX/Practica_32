import jerarquicos.AB;
import jerarquicos.ABEnteros;
import jerarquicos.NodoAB;

import java.util.Scanner;

public class Menu {
    private ABEnteros<Integer> AB, AB1, AB2;
    private int opcion, opcionArbol;
    private Scanner sc;
    public Menu(){

    }
    public void ejecutar(){
        do{
            sc = new Scanner(System.in);
            System.out.println("\n\t\t MENÚ AB de Enteros\n");
            System.out.println("1. Crear AB de enteros\n");
            System.out.println("2. Listado de claves en InOrden");
            System.out.println("3. Listado de claves en InOrden Converso");
            System.out.println("4. Listado de claves en PreOrden");
            System.out.println("5. Listado de claves en PostOrden");
            System.out.println("6. Comprobar sumas");
            System.out.println("7. Comprobar clave pequeña");
            System.out.println("8. Vaciar Árbol Modo 1 (sin recorrer el árbol)");
            System.out.println("9. Vaciar Árbol Modo 2 (recorriendo todos sus nodos)");
            System.out.println("10. Mostrar ascendientes");
            System.out.println("11. Suma total de nodos entre dos niveles");
            System.out.println("12. Número de nodos impares que hay en un nivel\n");
            System.out.println("0. Salir");
            System.out.println("Introduzca una opción:");
            opcion=sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar la aplicación!");
                    break;
                case 1:
                    AB = construirArbol();
                    AB1 = new ABEnteros<Integer>(AB.getRaiz().getDer());
                    AB2= new ABEnteros<Integer>(AB.getRaiz().getIzq());
                    break;
                case 2:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println(AB1.listadoInOrden());
                    }
                    else{
                        System.out.println(AB2.listadoInOrden());
                    }
                    break;
                case 3:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println(AB1.listadoInOrdenConverso());
                    }
                    else{
                        System.out.println(AB2.listadoInOrdenConverso());
                    }
                    break;
                case 4:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println(AB1.listadoPreOrden());
                    }
                    else{
                        System.out.println(AB2.listadoPreOrden());
                    }
                    break;
                case 5:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println(AB1.listadoPostOrden());
                    }
                    else{
                        System.out.println(AB2.listadoPostOrden());
                    }
                    break;
                case 6:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println(AB1.comprobarSumas());
                    }
                    else{
                        System.out.println(AB2.comprobarSumas());
                    }
                    break;
                case 7:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println(AB1.comprobarClavePequenia());
                    }
                    else{
                        System.out.println(AB2.comprobarClavePequenia());
                    }
                    break;
                case 8:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        AB1.vaciarArbolSinRecorrer();
                    }
                    else{
                        AB2.vaciarArbolSinRecorrer();
                    }
                    break;
                case 9:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    if(opcionArbol==1){
                        AB1.vaciarArbolRecorriendo();
                    }
                    else{
                        AB2.vaciarArbolRecorriendo();
                    }
                    break;
                case 10:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    System.out.println("Introduzca la clave del nodo:");
                    int clave = sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println("En el arbol " + "AB" + opcionArbol + " los ascendientes del nodo " + clave + " son: " + AB1.mostrarAscendientes(clave));
                    }
                    else{
                        System.out.println("En el arbol " + "AB" + opcionArbol + " los ascendientes del nodo " + clave + " son: " + AB2.mostrarAscendientes(clave));
                    }
                    break;
                case 11:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    System.out.println("Introduzca K1:");
                    int K1 = sc.nextInt();
                    System.out.println("Introduzca K2:");
                    int K2 = sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println("La suma de elementos enre estos niveles es:" + AB1.sumaNodosNiveles(K1, K2));
                    }
                    else{
                        System.out.println("La suma de elementos enre estos niveles es:" + AB2.sumaNodosNiveles(K1, K2));
                    }
                    break;
                case 12:
                    System.out.println("Cual es el arbol que desea considerar: 1-AB1, 2-AB2");
                    opcionArbol=sc.nextInt();
                    System.out.println("Introduzca el nivel:");
                    int nivel = sc.nextInt();
                    if(opcionArbol==1){
                        System.out.println("El numero de nodos impares en el arbol " + "AB" + opcionArbol + " y el nivel " + nivel + " es: " + AB1.numeroNodosImpares(nivel));
                    }
                    else{
                        System.out.println("El numero de nodos impares en el arbol " + "AB" + opcionArbol + " y el nivel " + nivel + " es: " + AB2.numeroNodosImpares(nivel));
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }
        }while(opcion!=0);

    }
    public static ABEnteros<Integer> construirArbol(){
        ABEnteros<Integer> AB;
        NodoAB<Integer> n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16;
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
        n11= new NodoAB<Integer>(null,null, 8);
        n12 = new NodoAB<Integer>(null, n11, 5);
        n13= new NodoAB<Integer>(null, null, 9);
        n14 = new NodoAB<Integer>(null, null, 7);
        n15 = new NodoAB<Integer>(n13, n14, 6);
        n16= new NodoAB<Integer>(n15, n12, 2);
        n0 = new NodoAB<Integer>(n10, n16, 0);
        AB = new ABEnteros<Integer>(n0);
        return AB;

    }
}

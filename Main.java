public class Main {
    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);

        Nodo hijo1 = new Nodo(2);
        Nodo hijo2 = new Nodo(3);
        Nodo hijo3 = new Nodo(4);

        raiz.agregarHijo(hijo1);
        raiz.agregarHijo(hijo2);
        raiz.agregarHijo(hijo3);

        hijo1.agregarHijo(new Nodo(5));
        hijo1.agregarHijo(new Nodo(6));

        ArbolGeneral arbol = new ArbolGeneral(raiz);

        System.out.println("El grado del árbol es: " + arbol.grado());
    }
}

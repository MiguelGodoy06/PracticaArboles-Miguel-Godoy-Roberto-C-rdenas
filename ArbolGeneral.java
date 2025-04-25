public class ArbolGeneral {
    Nodo raiz;

    public ArbolGeneral(Nodo raiz) {
        this.raiz = raiz;
    }
    //Método:
    public int grado() {
        return calcularGrado(raiz);
    }


    private int calcularGrado(Nodo nodo) {
        if (nodo == null) return 0;

        int max = nodo.hijos.size();

        for (Nodo hijo : nodo.hijos) {
            int gradoHijo = calcularGrado(hijo);
            if (gradoHijo > max) {
                max = gradoHijo;
            }
        }

        return max;
    }
}

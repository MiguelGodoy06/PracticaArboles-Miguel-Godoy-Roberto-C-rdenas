import java.util.ArrayList;
import java.util.List;

public class Nodo {
    int dato;
    List<Nodo> hijos;

    public Nodo(int dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }
}


# Practica Árboles
## Miguel Godoy y Roberto Cárdenas

### Link repositorio:
https://github.com/MiguelGodoy06/PracticaArboles-Miguel-Godoy-Roberto-C-rdenas.git
### Explicación del ejercicio:
En el trabajo se nos pedía implementar un Árbol General en java y un método llamado grado que nos va a permitir calcular el grado de dicho árbol.
En este caso el árbol se define como el máximo número de hijos que tiene un nodo dentro del árbol.
### Estructura del código.
#### 1. Clase `Nodo`
Esta clase representa un nodo del árbol. Cada nodo tiene:
- Un dato (`int`)
- Una lista de hijos (`List<Nodo>`)

```java
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



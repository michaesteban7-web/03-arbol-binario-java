public class ArbolBinario<lleno> {

    private NodoArbol<lleno> raiz;

    
    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(NodoArbol<lleno> raiz) {
        this.raiz = raiz;
    }

    public NodoArbol<lleno> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol<lleno> raiz) {
        this.raiz = raiz;
    }
     public void imprimirRaizYHijos() {

        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        System.out.println("Raíz: " + raiz.getDato());

        if (raiz.getIzquierdo() != null) {
            System.out.println(
                "Hijo izquierdo: " + raiz.getIzquierdo().getDato()
            );
        } else {
            System.out.println("Hijo izquierdo: null");
        }

        if (raiz.getDerecho() != null) {
            System.out.println(
                "Hijo derecho: " + raiz.getDerecho().getDato()
            );
        } else {
            System.out.println("Hijo derecho: null");
        }
    }


    public void imprimirArbol() {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        imprimirRecursivo(raiz, 0, "RAÍZ");
    }

    private void imprimirRecursivo(
            NodoArbol<lleno> nodo,
            int nivel,
            String relacion) {

        if (nodo == null) {
            return;
        }

        String sangria = "   ".repeat(nivel);

        System.out.println(
            sangria + relacion + " -> " + nodo.getDato()
        );

        imprimirRecursivo(
            nodo.getIzquierdo(), nivel + 1, "IZQ"
        );

        imprimirRecursivo(
            nodo.getDerecho(), nivel + 1, "DER"
        );
    }

    public int contarNodos() {
        return contarNodos(raiz);
    }

    private int contarNodos(NodoArbol<lleno> nodo) {
        if (nodo == null) return 0;

        return 1
            + contarNodos(nodo.getIzquierdo())
            + contarNodos(nodo.getDerecho());
    }

    public int contarHojas() {
        return contarHojas(raiz);
    }

    private int contarHojas(NodoArbol<lleno> nodo) {
        if (nodo == null) return 0;
        if (nodo.esHoja()) return 1;

        return contarHojas(nodo.getIzquierdo())
            + contarHojas(nodo.getDerecho());
    }
    public int altura() {
        return altura(raiz);
    }

    private int altura(NodoArbol<lleno> nodo) {
        if (nodo == null) return -1;

        int izq = altura(nodo.getIzquierdo());
        int der = altura(nodo.getDerecho());

        return 1 + Math.max(izq, der);
    }
}



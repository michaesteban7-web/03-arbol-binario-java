public class estructura{
    public static void main(String[]args){

        /* PRIMER ARBOL BINARIO ARBOL LLENO */

        /*CREACION DE NODOS DE  ARBOL LLENO */
        NodoArbol<String> a= new NodoArbol <>("1");/*raiz nivel #2*/
        NodoArbol<String> b= new NodoArbol <>("2");/*nivel #1 */
        NodoArbol<String> c= new NodoArbol <>("3");/*nivel #1 */
        NodoArbol<String> d= new NodoArbol <>("4");/*nivel #2 */
        NodoArbol<String> e= new NodoArbol <>("5");/*nivel #2 */
        NodoArbol<String> f= new NodoArbol <>("6");/*nivel #2 */
        NodoArbol<String> g= new NodoArbol <>("7");/*nivel #2 */

        /*CREACION DE ARBOL Y CONECCION DE NODOS  */

        /*RAIZ CON NIVEL #1*/
        a.setIzquierdo(b);
        a.setDerecho(c);

        /*nivel #1 b con nivel # 2*/

        b.setIzquierdo(d);
        b.setDerecho(e);

        /*nivel #1 c con nivel #2 */
        
        c.setIzquierdo(f);
        c.setDerecho(g);
        
        /*crear objeto del arbol */

        ArbolBinario<String> arbol = new ArbolBinario<>(a);

        System.out.println("=== RAÍZ===");
        arbol.imprimirRaizYHijos();

        /*estructura */
        System.out.println("\n=== ÁRBOL COMPLETO ===");
        arbol.imprimirArbol();

        
        System.out.println("\n=== PROPIEDADES ===");
        System.out.println("Nodos: " + arbol.contarNodos());
        System.out.println("Hojas: " + arbol.contarHojas());
        System.out.println("Altura: " + arbol.altura());
        System.out.println("Grado de A: " + a.grado());
        System.out.println("¿D es hoja?: " + d.esHoja());

     
        System.out.println("\n=== CONTROL DE NULL ===");

        System.out.println(
            "Hijo izquierdo de D: " + d.getIzquierdo()
        );

        if (d.getIzquierdo() != null) {
            System.out.println(d.getIzquierdo().getDato());
        } else {
            System.out.println(
                "D no tiene hijo izquierdo; la referencia es null."
            );
        }

        System.out.println("\n=== ÁRBOL VACÍO ===");
        ArbolBinario<Integer> vacio = new ArbolBinario<>();
        vacio.imprimirRaizYHijos();

    
    }
}


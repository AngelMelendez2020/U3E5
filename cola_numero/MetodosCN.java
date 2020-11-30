package cola_numero;


public class MetodosCN {
 Nodo raiz, cima, nuevo;
    int tam;

    public void ingresar(String nom,int lugar) {
        Nodo nodoI = new Nodo(nom,lugar);
        if (tam == 0) {
            cima = nodoI;
            raiz = nodoI;
            tam++;
        } else if (tam == 1) {
            cima = nodoI;
            raiz.siguiente = cima;
            tam++;
        } else {
            cima.siguiente = nodoI;
            cima = nodoI;
            tam++;
        }
    }

    public void salir() {
        if (tam == 0) {
            System.out.println("No hay nadie en la fila");
        } else if (tam == 1) {
            raiz = null;
            cima = null;
            tam--;
        } else {
            raiz = raiz.siguiente;
            tam--;
        }
    }

    public void mostrar() {
        if (tam == 0) {
            System.out.println("No hay nadie en la fila, formate para ser el primero");
        } else {
            Nodo revisa = raiz;
            System.out.print("Inicio de la cola -->: ");
            while (revisa != null) {
                System.out.print(revisa.nombre + " N°["+revisa.num+"] --> ");
                revisa = revisa.siguiente;
            }
            System.out.println("");
        }
    }
}


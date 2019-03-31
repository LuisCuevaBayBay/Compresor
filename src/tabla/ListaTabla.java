package tabla;

import excepciones.ListaVacia;
import listaArbol.Lista;

public class ListaTabla {

    private Nodo inicio;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void agregar(String valor, String ubicacion) {
        Nodo nuevo = new Nodo(valor, ubicacion);
        if (this.getInicio() == null)
            this.setInicio(nuevo);
        else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public Nodo sacarInicio() throws ListaVacia {
        if (this.inicio == null)
            throw new ListaVacia();
        Nodo aux = inicio;
        inicio = aux.getSiguiente();
        aux.setSiguiente(null);
        return aux;
    }

    public void Imprimir() {
        if (this.getInicio() != null) {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.println(aux.getDato() + ":" + aux.getUbicacion());
                aux = aux.getSiguiente();
            }
        }


    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ADMIN
 */
public class listaenlazada {
    private Nodo cabeza;
  

    public listaenlazada() {
        cabeza = null;

    
    }

public void insertar(int valor) {
        nodo nuevoNodo = new nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = (nodo) actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.siguiente == null && ((nodo) cabeza).siguiente.equals(valor)) {
            cabeza = null;
            return;
        }
        nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (((nodo) actual.siguiente).siguiente.equals(valor)) {
                actual.siguiente = ((nodo) actual.siguiente).siguiente;
                return;
            }
            actual = (nodo) actual.siguiente;
        }
    }

    public boolean buscar(int valor) {
        nodo actual = cabeza;
        while (actual != null) {
            if (((nodo) actual).siguiente.equals(valor)) {
                return true;
            }
            actual = (nodo) actual.siguiente;
        }
        return false;
    }

    public void mostrar() {
        nodo actual = cabeza;
        while (actual != null) {
            System.out.println(((nodo) actual).siguiente);
            actual = (nodo) actual.siguiente;
        }
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = (nodo) actual.siguiente;
        }
        return contador;
    }
  
}

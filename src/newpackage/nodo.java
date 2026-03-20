/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ADMIN
 */
public class nodo {
    int valor;

    nodo enlaceNodo;

    public Object siguiente;


    public nodo(int valor) {
        this.valor = valor;
        this.enlaceNodo = null;
    }


@Override
public String toString() {
    return "[Valor: " + valor + "]";
    
}
    
}

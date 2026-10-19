package Estructuras_lineales;

public class lanzadorPilaSimple {
    static void main(String[] args) {
        PilaSimple p = new PilaSimple();
        // Se llenan los 5 espacios del arreglo
        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
        p.push(50);
        p.push(60); //// Desbordamiento: no hay espacio, muestra "¡Pila llena!
        System.out.println();
        p.mostrar();// Muestra: 10 20 30 40 50
        p.isFull();// Con 5 elementos: "Pila alcanzo su limite"
        p.isEmpty(); // "Pila no esta vacia"


        p.pop();  // Saca el 50 (el último que entró)
        System.out.println();
        p.mostrar(); // Muestra: 10 20 30 40
        p.isEmpty();// "Pila no esta vacia"
        p.isFull(); // Ya hay un espacio libre: "Pila no alcanzo su limite"
        p.peek();// "Tope: 40" (consulta sin eliminar)

    }
}

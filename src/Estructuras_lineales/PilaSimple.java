package Estructuras_lineales;

public class PilaSimple {
    // Arreglo que guarda los elementos de la pila (capacidad fija de 5)
    int[] datos = new int[5];
   //Índice del elemento que está en el tope. -1 significa pila vacía
    int tope = -1;

    // Inserta un elemento en el tope, controlando el desbordamiento (overflow)
    void push(int x){

        // Hay espacio mientras el tope no llegue a la última posición del arreglo
        if (tope < datos.length - 1){
            tope++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        }
        else{
            System.out.println("¡Pila llena!");
        }
    }

    // Extrae el elemento del tope, controlando el subdesbordamiento (underflow)
    void pop(){
        if (tope >= 0){
            System.out.println("Sacaste: " + datos[tope]);
            tope--;
        }
        else{
            System.out.println("¡Pila vacia!");
        }
    }

    // Imprime el contenido de la pila, de la base (posición 0) al tope
    void mostrar(){
        System.out.println("Pila actual:" );
        for (int i = 0; i <= tope; i++){
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    // (A agregar) Verifica si la pila está vacía: tope == -1
    void isEmpty(){
        if (tope == - 1){
            System.out.println("¡Pila esta vacia!");
        }
        else{
            System.out.println("Pila no esta vacia");
        }
    }

    // (A agregar, exclusivo de la estática) Verifica si el arreglo alcanzó su límite:
    // tope == datos.length - 1
    void isFull(){
        if (tope == datos.length - 1){
            System.out.println("Pila alcanzo su limite");
        }
        else{
            System.out.println("Pila no alcanzo su limite");
        }
    }

    // (A agregar) Consulta el elemento del tope sin eliminarlo (tope no cambia)
    void peek(){
        if (tope == - 1){
            System.out.println("¡Pila vacia, no hay tope!");
        }
        else{
            System.out.println("Tope: " + datos[tope]);
        }
    }
}

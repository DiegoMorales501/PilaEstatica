# Pila estática en Java 📚

Proyecto donde implemento una **pila estática** en Java, basada en un **arreglo de tamaño fijo**.

Una pila funciona con la regla **LIFO**: el último en entrar es el primero en salir. Es como una pila de platos: pones uno arriba y también quitas el de arriba.

---

## Estructura del proyecto

```
Estructuras_lineales/
├── PilaSimple.java            # Pila estática (arreglo)
└── lanzadorPilaSimple.java    # Main para probarla
```

---

## Estático vs. dinámico (la idea corta)

### Almacenamiento estático (arreglo)

- Los datos se guardan en un **arreglo de tamaño fijo**, o sea, en espacios **contiguos** de memoria.
- El tamaño se decide al crear la pila (aquí son 5 espacios) y **no cambia**.
- Si el arreglo se llena, ya no puedes meter más: eso es el **desbordamiento** (overflow).
- Se maneja con un índice llamado `tope`: vale `-1` cuando la pila está vacía y `datos.length - 1` cuando está llena.
- Ventaja: es simple y rápido de acceder. Desventaja: desperdicias espacio si usas poco, o te quedas corto si necesitas más.

### Almacenamiento dinámico (nodos enlazados)

- Cada elemento vive en un **nodo** que guarda el dato y una **referencia al siguiente nodo**.
- Los nodos **no están pegados** en memoria, se van creando conforme se necesitan y se enlazan entre sí.
- No hay un tamaño máximo fijo (solo el que permita la memoria).
- Ventaja: crece y se encoge según lo que ocupes. Desventaja: cada nodo gasta memoria extra por guardar la referencia.

| | Estática (arreglo) | Dinámica (nodos) |
|---|---|---|
| Memoria | Contigua | Dispersa, enlazada |
| Tamaño | Fijo | Variable |
| ¿Se puede llenar? | Sí | Solo si se acaba la memoria |
| Estructura base | `int[] datos` | Nodos con referencia al siguiente |

---

## Métodos de la pila (`PilaSimple`)

- `push(int x)`: mete un elemento al tope (avisa si la pila está llena).
- `pop()`: saca el elemento del tope (avisa si la pila está vacía).
- `mostrar()`: imprime el contenido de la pila.
- `isEmpty()`: dice si la pila está vacía (`tope == -1`).
- `isFull()`: dice si el arreglo llegó a su límite (`tope == datos.length - 1`).
- `peek()`: muestra el elemento del tope **sin** sacarlo.

---

## Cómo compilar y ejecutar

Necesitas tener **Java (JDK)** instalado. Para checar: `java -version` y `javac -version`.

### Desde la terminal

1. Abre una terminal en la carpeta que **contiene** la carpeta `Estructuras_lineales` (en IntelliJ/Eclipse normalmente es `src`).

2. Compila:

```bash
javac Estructuras_lineales/*.java
```

3. Ejecuta:

```bash
java Estructuras_lineales.lanzadorPilaSimple
```

> Ojo: se ejecuta con el nombre del paquete (`Estructuras_lineales.`), no entrando a la carpeta.

### Desde un IDE (IntelliJ, Eclipse, NetBeans)

1. Importa o abre el proyecto.
2. Verifica que las clases estén dentro del paquete `Estructuras_lineales`.
3. Abre `lanzadorPilaSimple` y dale **Run** al `main`.

---

## Ejemplo de ejecución

El lanzador mete 5 elementos, intenta meter un sexto (para probar el desbordamiento), muestra la pila, saca un elemento y consulta el tope.

```text
Metiste: 10
Metiste: 20
Metiste: 30
Metiste: 40
Metiste: 50
¡Pila llena!

Pila actual:
10 20 30 40 50 
Pila alcanzo su limite
Pila no esta vacia
Sacaste: 50

Pila actual:
10 20 30 40 
Pila no esta vacia
Pila no alcanzo su limite
Tope: 40
```

---

## Notas

- `isEmpty()`, `isFull()` y `peek()` imprimen su resultado directamente en consola.
- El `push(60)` del ejemplo es a propósito, para mostrar que el control de desbordamiento funciona.
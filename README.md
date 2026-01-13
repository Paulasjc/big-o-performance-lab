# Java Performance Lab: Big O Analysis

Este repositorio es un laboratorio de pruebas para demostrar empíricamente cómo la elección de estructuras de datos y algoritmos afecta el rendimiento de una aplicación a medida que escala.

## Experimento 1: Búsqueda (ArrayList vs HashSet)
En este test comparamos cuánto tarda cada estructura en encontrar un elemento en el peor de los casos (elemento al final de la lista).

* **Volumen de datos:** 1,000,000 de registros.
* **Target:** Último elemento de la colección.

| Estructura | Notación Big O | Tiempo (ns) | Rendimiento |
| **ArrayList** | O(n) (Lineal) | 19,233,900 |  Lento |
| **HashSet** | O(1) (Constante) | 35,100 | Instantáneo |

**Conclusión:** El `HashSet` utiliza una tabla Hash que permite el acceso directo, eliminando la necesidad de recorrer la lista completa.

---

## Experimento 2: Detección de Duplicados (Fuerza Bruta vs HashSet)
Aquí comparamos un algoritmo de bucles anidados frente a uno que utiliza memoria extra para ganar velocidad.

* **Volumen de datos:** 50,000 registros.

| Algoritmo | Notación Big O | Tiempo (ns) | Impacto CPU |
| :--- | :--- | :--- | :--- |
| **Fuerza Bruta** | O(n^2) (Cuadrático) | 187,837,500 | Alto |
| **Optimizado** | O(n) (Lineal) | 9,171,300 |  Bajo |



**Análisis técnico:**
El algoritmo de Fuerza Bruta compara "todos contra todos", lo que significa que si duplicamos los datos, el tiempo se cuadruplica. El algoritmo optimizado solo realiza una pasada por el array, manteniendo un crecimiento proporcional a los datos.

---

## Requisitos y Ejecución
1. Tener instalado el **JDK 23** o superior.
2. Compilar: `javac Main.java`
3. Ejecutar: `java Main`

## 💡 Lecciones Aprendidas
1. **Space-Time Tradeoff:** A menudo usamos más memoria (como el `HashSet`) para ahorrar tiempo de procesamiento.
2. **Escalabilidad:** Un código que funciona con 100 datos puede romper el sistema con 100,000 si no se tiene en cuenta la complejidad algorítmica.
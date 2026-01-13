# Data Structures Performance Lab: List vs Set
En este proyecto comparo la eficiencia de búsqueda entre una ArrayList O(n) y un HashSet O(1) en Java, utilizando un volumen de 1,000,000 de registros.

Estructura | Complejidad | Tiempo de Búsqueda (ns)
ArrayList      O(n)              19,233,900
HashSet        O(1)              35,100

Conclusión: La diferencia de rendimiento se debe a que ArrayList.contains() realiza una búsqueda lineal (compara uno por uno), mientras que HashSet utiliza Hashing, permitiendo un acceso directo al elemento independientemente del tamaño de la colección.
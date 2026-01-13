import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> datosUser = new ArrayList<>();
        Set<String> datosUserHashSet = new HashSet<>();

        int totalElements = 1000000;
        // Incluyo los datos:
        for(int i=0; i < totalElements; i++){
            String userId = "User" + i;
            datosUser.add(userId);
            datosUserHashSet.add(userId);
        }


        String targetUserId = "User999999"; // El último elemento. - El peor escenario.

        // Bloques de medición:
        // Para la lista:
        long startList = System.nanoTime();
        datosUser.contains(targetUserId);
        long endList = System.nanoTime();
        long durationList = endList - startList;
        
        // Para el Set:
        long startSet = System.nanoTime();
        datosUserHashSet.contains(targetUserId);
        long endSet = System.nanoTime();
        long durationSet = endSet - startSet;

        // Imprimo los resultados:
        System.out.println("Tiempo de ejecución para la lista: " + durationList + " nanosegundos");
        System.out.println("Tiempo de ejecución para el Set: " + durationSet + " nanosegundos");
    }
}
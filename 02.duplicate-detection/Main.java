import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Array con 50000 elementos únicos:
        int[] elementos = new int[50000];
        for(int i=0; i < 50000; i++){
            elementos[i] = i;
        }

        // Bloque de medición brute force:
        long startBruceForce = System.nanoTime();
        hasDuplicateBruceForce(elementos);
        long endBruceForce = System.nanoTime();
        long durationBruceForce = endBruceForce - startBruceForce;
        System.out.println("Tiempo de ejecución brute force: " + durationBruceForce + " nanosegundos");

        // Bloque de medición optimized:
        long startOptimized = System.nanoTime();
        hasDuplicateOptimized(elementos);
        long endOptimized = System.nanoTime();
        long durationOptimized = endOptimized - startOptimized;
        System.out.println("Tiempo de ejecución optimized: " + durationOptimized + " nanosegundos");
    }

    // Método 1 - detectar elementos duplicados:
    public static boolean hasDuplicateBruceForce (int[] arr){
        for(int i=0; i < arr.length; i++){
            for(int j= i+1; j < arr.length; j++){
                if(arr[i] == arr[j] ){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicateOptimized (int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
     Map<Integer, Integer>  histogram = new HashMap<>();   
     
     // si el histograma  y comprobamos si  existe la clave i, si existe aumentamos su contador, sino ponemos 1
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
            
        
        // recorremos el mapa por sus claves y mostramos el numero de repeticiones
        for (int key : histogram.keySet()) { //fore+tab // KeySet() -> conjunto de claves del mapa
            System.out.println(key + " --> " + histogram.get(key));
   
        }
    }
}

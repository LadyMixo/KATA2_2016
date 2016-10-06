package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
     Map<Integer, Integer>  histogram = new HashMap<>();   
     
     // vamos recorriendo el vexctor de datos con un bucle
     // vamos inicializando el mapa
        for (int i = 0; i < data.length; i++) { //fori+tab
            if (!histogram.containsKey(data[i])){
                histogram.put(data[i], 0);
            }
            //si tiene valos, ponemos en el mapa el valor de esa posición
            histogram.put(data[i], histogram.get(data[i])+1);
        }
        
        // recorremos el mapa por sus claves y mostramos el numero de repeticiones
        for (int key : histogram.keySet()) { //fore+tab // KeySet() -> conjunto de claves del mapa
            System.out.println(key + " --> " + histogram.get(key));
               
        }
    }
}

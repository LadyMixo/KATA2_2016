package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
     
       
        // recorremos el mapa por sus claves y mostramos el numero de repeticiones
        for (int key : histogr.keySet()) { //fore+tab // KeySet() -> conjunto de claves del mapa
            System.out.println(key + " --> " + histogr.get(key));
   
        }
    }
}

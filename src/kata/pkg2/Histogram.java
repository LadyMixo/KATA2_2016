package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;

    // comando para crear constructor= Alt+Insert
    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    // importar librería= Alt+Enter
    public Map<Integer, Integer> getHistogram (){
        Map<Integer, Integer> histogram = new HashMap<>();
        
        // podemos recorrerlo con un bucle o con una operación ternaria.
        for (int i = 0; i < data.length; i++) {
            if (!histogram.containsKey(data[i])){
                histogram.put(data[i],0);
            }
        
            histogram.put(data[i], histogram.get(data[i])+1);
        }
        return histogram;
    }
    
}

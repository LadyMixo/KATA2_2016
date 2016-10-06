package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

// hacemos la clase histogram genérica <T>
public class Histogram<T> {
    private final T[] data;

    // comando para crear constructor= Alt+Insert
    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    // importar librería= Alt+Enter
    public Map<T, Integer> getHistogram (){
        Map<T, Integer> histogram = new HashMap<>();
        
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

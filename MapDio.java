import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDio {
    public static void main(String[] args) {
        //Os valores podem repetir, as chaves não;

        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15d);
            put("mobi",16.4);
            put("hb20",14.5);
            put("kwid",15.4);

        }};
        
        System.out.println(carrosPopulares.toString());

    System.out.println("Substitua o consumo do gol por 15,2;");
    carrosPopulares.put("gol",15.2);
    System.out.println(carrosPopulares);
    System.out.println(carrosPopulares.containsKey("uno"));
    System.out.println(carrosPopulares.get("uno"));
    System.out.println("Exiba os modelos: ");
    
    //erro Set <String>modelos=carrosPopulares.KeySet();
    //System.out.println(modelos);
    
    //Exiba o consumo
    Collection<Double>consumos=carrosPopulares.values();

    System.out.println(consumos);

    Double consumoMaisEficiente= Collections.max(carrosPopulares.values());
    Set<Entry<String,Double>>entries=carrosPopulares.entrySet();
    String modeloMaisEficiente="";

    for(Map.Entry<String,Double> entry:entries){
        if(entry.getValue().equals(consumoMaisEficiente))
        modeloMaisEficiente=entry.getKey();

        System.out.println("Modelo mais eficiente: "+modeloMaisEficiente+"-"+consumoMaisEficiente);

    }
        
}

    
}

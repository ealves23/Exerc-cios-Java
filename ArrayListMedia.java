import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMedia {
    public static void main(String[] args) {
        
        List<Double>nota=new ArrayList<Double>();
        nota.add(4d);
        nota.add(8d);
        nota.add(6d);
        nota.add(3d);
        nota.add(4d);
        
        Iterator<Double> iterator = nota.iterator();
        Double soma = 0d;
        
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/nota.size()));
    }
}

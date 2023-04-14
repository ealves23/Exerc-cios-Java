import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExercicioSet{
    public static void main(String[] args) {
        Set<Double>notas=new HashSet<>(Arrays.asList(7d,8.5,9.3,5d));
        
    //quando trabalho com set nao consigo buscar a posiçao
    //confira se a nota esta no conjunto,nao consigo fazer pois nao tenho get
        System.out.println(notas.toString());
        System.out.println(notas.contains(5d));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
    System.out.println("Exiba a soma: ");
    Iterator<Double>iterator=notas.iterator();
    Double soma=0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;

        }
    System.out.println("A soma é: "+soma);
    System.out.println("A média é: "+soma/notas.size());
    notas.remove(0d);
    System.out.println(notas);
    System.out.println("Remova as notas menores que 7: ");
    
    //erro nesse bloco
    //Iterator<Double>iterator1=notas.iterator();
    
    //while(iterator1.hasNext()){
    //        Double next=iterator1.next();
    //        if(next<7) iterator.remove();

     //   }
        System.out.println(notas);
    Set<Double>notas2=new LinkedHashSet<>();
    notas2.add(7d);
    notas.add(8.5);
    notas2.add(9.3);
    notas2.add(5d);
    notas2.add(7d);
    notas2.add(0d);
    System.out.println(notas2);
    
    System.out.println("Exiba as notas em ordem crescente");
    Set<Double>notas3=new TreeSet<>(notas2);
    System.out.println(notas3);
    
    System.out.println("Apague todo o conjunto: ");
    notas2.clear();
    
    System.out.println("Confira se o conjunto está vazio: "+notas2.isEmpty());

}

}

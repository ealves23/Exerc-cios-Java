import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArraylistTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //Adicionando as temperaturas na lista:
        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Digite 6 temperaturas: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-----------------");

        //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

    }
}

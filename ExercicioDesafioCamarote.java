import java.util.Scanner;

public class ExercicoCamarote {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int tamanhoDaFila=leitor.nextInt();
        int pessoasNoCamarote=0;

        if (tamanhoDaFila%2==0){
            pessoasNoCamarote=tamanhoDaFila/2;
        }
        else{
            pessoasNoCamarote=tamanhoDaFila/2+1;
        }

    System.out.println(pessoasNoCamarote);


    }
}

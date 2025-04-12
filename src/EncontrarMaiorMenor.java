package src;
import java.util.Scanner;

public class EncontrarMaiorMenor {
    public static void main(String[] args){
        Scanner snc = new Scanner(System.in);
        int[] bff = new int[10];
        
        for(int i = 0; i < bff.length; i++){
            bff[i] = snc.nextInt();
        }

        int maior = bff[0];
        int menor = bff[0];
        int indMaior = 0;
        int indMenor = 0;

        for(int i = 0; i < bff.length; i++){
            if(bff[i] > maior){
                maior = bff[i];
                indMaior = i;
            }
            if(bff[i] < menor){
                menor = bff[i];
                indMenor = i;
            }
        }

        System.out.printf("Maior: [%d] %d ", indMaior, maior);
        System.out.printf("Menor: [%d] %d", indMenor, menor);

        snc.close();
    }
}

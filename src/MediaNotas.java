package src;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double[] bff = new double[5];
        double soma = 0;

        for(int i = 0; i < bff.length; i++){
            bff[i] = scn.nextDouble();
            soma += bff[i];
        }

        double media = soma / bff.length;
        int acima = 0;
        for(double nota : bff){
            if(nota > media){
                acima++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Acima da média: " + acima);

        scn.close();
    }
}
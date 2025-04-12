package src;
import java.util.Arrays;
import java.util.Scanner;


public class OrdenacaoSimples {
    public static void main(String[] args){
        String[] bff = new String[8];
        Scanner scn = new Scanner(System.in);
        
        for(int i = 0; i < bff.length; i++){
            bff[i] = scn.nextLine(); 
        }

        System.out.println("Array antes da ordenação: ");
        for(String x : bff){
            System.out.println(x);
        }

        Arrays.sort(bff);

        System.out.println("Array depois da ordenação: ");
        for(String x : bff){
            System.out.println(x);
        }

        scn.close();
    }
}

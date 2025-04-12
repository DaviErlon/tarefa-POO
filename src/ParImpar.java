package src;
import java.util.Random;
import java.util.ArrayList;

public class ParImpar {
    public static void main(String[] args){

        int[] bff = new int[20];
        Random rand = new Random();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        
        for(int i = 0; i < bff.length; i++){
            bff[i] = rand.nextInt(50) + 1;
            if(bff[i] % 2 == 0){
                pares.add(bff[i]);
            } else {
                impares.add(bff[i]);
            }
        }

        System.out.print("Array original: ");
        for(int i : bff){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array de pares: ");
        for(int i : pares){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array de ímpares: ");
        for(int i : impares){
            System.out.print(i + " ");
        }
    }
}

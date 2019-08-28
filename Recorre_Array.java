package recursividad;

import java.util.Scanner;

public class Recorre_Array {
    static Scanner input = new Scanner(System.in);
    public static void vectorRecorrido(int []vec, int n){
        if(n != -1){
            System.out.println(vec[n] + "\t");
            n = n - 1;
            vectorRecorrido(vec, n);
        }
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Digite un numero: ");
        n = input.nextInt();
        
        int []vec = new int[n];
        
        for(int i = 0; i <n;i++)
            vec[i] = (int)(Math.random()*10);
        vectorRecorrido(vec,n-1);
    }    
}

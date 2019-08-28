package recursividad;

import java.util.Scanner;

public class Factorial_Recursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println(num + "! = " + factorial(num));
        
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        System.out.println("Time: "+dif);
    }
     
    public static double factorial(int n){
        if(n == 0){
            return 1;
        }
        else
            return n * factorial(n-1);
    }
}

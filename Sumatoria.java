package recursividad;

import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println(num + " = " + sumatoria(num));
    }
    
    public static double sumatoria(int n){
        if(n == 0){
            return 1;
        }
        else
            return n + sumatoria(n-1);
    }
}

package recursividad;

import java.util.Scanner;

public class Numeros_Consecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor final: ");
        int num = sc.nextInt();
        System.out.println(numConsec(num));
    }
    
    public static int numConsec(int n){
        if(n == 0)
            return 0;
        else
            System.out.print(n+" ");
            return numConsec(n-1);
    }
}

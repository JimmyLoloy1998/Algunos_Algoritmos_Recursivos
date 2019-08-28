package recursividad;

import java.util.Scanner;

public class Fibonacci_Recursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int limite = sc.nextInt();

        for(int i = 0; i<limite; i++){
            System.out.print(funcionFibonacci(i) + "  ");
        }
        System.out.println("");
    }

    private static int funcionFibonacci(int num){
        if(num == 0 || num==1)
            return num;
        else
            return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    }
}
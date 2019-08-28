package recursividad;

import java.util.Scanner;

public class Factorial_Iterativo{
    public static void main(String[] args) {
        int numero = leerNumero();
        while (numero>-1) {
            mostrarFactorial(numero);
            numero = leerNumero();
        }   
        System.out.println("\nFin del programa");
        
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        System.out.println("Time: "+dif);
    }
 
    private static double mostrarFactorial(int num){
        System.out.printf("%n%d! = ", num);
        double fact = 1;
        if(num!=0){
            for(int i = num;i>0;i--){
                fact *= i;
                /*System.out.print(i);
                if(i>1){
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }*/
            }
        }
        System.out.println(fact + "\n");
        return fact;
    }
     
    private static int leerNumero(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        return num;
    }
}

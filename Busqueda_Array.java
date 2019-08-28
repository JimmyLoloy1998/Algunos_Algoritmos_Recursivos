package recursividad;

import java.util.Scanner;

public class Busqueda_Array {
    public static void main(String[] args) {
        int arr[]={1,10,5,3,8,2,9};
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.print("Digite un numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("En posicion: " + busqueda(numero, arr.length - 1,arr));
    }
    
    public static int busqueda(int numero, int pos, int arr[]){
        if(arr[pos] == numero)
            return pos;
        else
            pos--;
            return busqueda(numero, pos, arr);
    }
}

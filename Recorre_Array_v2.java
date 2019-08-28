package recursividad;

import java.util.Scanner;

public class Recorre_Array_v2 {
    private int[] vector;
    public Recorre_Array_v2(int[] v) {
        vector = v;
    }

    public void leerVector(int pos){
        if (pos == vector.length-1) { System.out.println("Elemento en posición "+pos + " es "+vector[pos]);}
        else {
            System.out.println("Elemento en posición "+pos + " es "+vector[pos]);
            leerVector(pos+1);
        }
    }
    public static void main (String[] Args) {
        int[] a = {2, 3, 8, 1, 9};
        Recorre_Array_v2 miVector = new Recorre_Array_v2(a);
        miVector.leerVector(0);
    }
}

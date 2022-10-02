package ejemplo.arreglos;
import java.util.Scanner;

public class EjemploArreglos {
    public static void main(String[] args) {
        int A,B;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese A");
        A = entrada.nextInt();
        System.out.println("Ingrese B");
        B = entrada.nextInt();
        
        if (A < B){
            for (int i = 0; i<(B-A +1); i++){
                System.out.println(A+i);
            }
        }
        else{
            for (int i = 0; i<(A-B +1); i++){
                System.out.println(B+i);
            }
        }
    }
    
}

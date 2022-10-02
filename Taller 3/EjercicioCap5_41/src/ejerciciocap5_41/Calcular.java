package ejerciciocap5_41;

public class Calcular {
    
    static double mayor = 0;
    
    public static void borrarLista(){
        mayor = 0;
    }
    public static void evaluar(double numero){
        if(numero > mayor){
            mayor = numero;
        }
    }
    public static String calcular(){
        return String.valueOf(mayor);
    }
}

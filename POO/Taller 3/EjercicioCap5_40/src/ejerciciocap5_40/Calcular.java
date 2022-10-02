package ejerciciocap5_40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calcular {
    
    static List<Double> listaNumeros = new ArrayList<>(Arrays.asList());
    
    public static void borrarLista(){
        listaNumeros =new ArrayList<>(Arrays.asList());
    }
    public static void agregarNumero(double numero){
        listaNumeros.add(numero);
    }
    public static String calcular(){
        String respuesta = "";
        for(int i = 0; i < listaNumeros.size();i++){
            String ra = String.valueOf(raiz(listaNumeros.get(i)))+"\n";
            String cua = String.valueOf(cuadrado(listaNumeros.get(i)))+"\n";
            String cub = String.valueOf(cubo(listaNumeros.get(i)))+"\n";
            respuesta = respuesta +"n: "+listaNumeros.get(i)+"\n"+"Raiz: "+ra+"Cuadrado: "+cua+"Cubo: "+cub+"\n";
        }
        return respuesta;
    }
    
    public static double raiz(double numero){
        return Math.sqrt(numero);
    }
    public static double cuadrado(double numero){
        return Math.pow(numero,2);
    }
    public static double cubo(double numero){
        return Math.pow(numero,3);
    }
}

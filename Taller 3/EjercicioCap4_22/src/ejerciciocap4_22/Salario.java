package ejerciciocap4_22;

public class Salario {
    public static String resultado1(double SPH,double H){
        double Sueldo;
        String respuesta;
        
        Sueldo = SPH*H;
        
        if (Sueldo > 450000){
            respuesta = String.valueOf(Sueldo);
        }
        else{
            respuesta = "";
        }
        
        return respuesta;
    }
}

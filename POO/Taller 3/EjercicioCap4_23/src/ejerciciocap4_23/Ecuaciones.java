package ejerciciocap4_23;

public class Ecuaciones {
    public static Double resultado1(double a,double b,double c){
        double valor1;
        
        valor1=(-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        
        return (valor1);
    }
    public static Double resultado2(double a,double b,double c){
        double valor2;
        
        valor2=(-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        
        return (valor2);
    }
}

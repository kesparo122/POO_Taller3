
package resueltocap4_7;

public class MayorMenor {
    public static String Mayor(double A,double B){
        String mensaje;
        if(A<B){
            mensaje = "A es menor que B";
        }
        else if(A>B){
            mensaje = "A es mayor que B";
        }
        else{
            mensaje = "A es igual que B";
        }
        return mensaje;
    }
}

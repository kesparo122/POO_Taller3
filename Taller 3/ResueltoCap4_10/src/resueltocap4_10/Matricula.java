package resueltocap4_10;

public class Matricula {
    public static double pagoMatricula(double pat,double est){
        double pagmat = 50000;
        
        if (pat > 2000000 && est > 3){
            pagmat = pagmat + pat*0.03;
        }
        return pagmat;
    }
}

package ejerciciocap3_18;

public class Salario {
    public static double calSalarioBruto(double horas, double vHora){
        double sBruto;
        sBruto = horas * vHora;
        return sBruto;
    }
    public static double calRetFuente(double sBruto, double pRet){
        double retFuente;
        retFuente = (sBruto*pRet)/100;
        return retFuente;
    }
    public static double calSalarioNeto(double sBruto, double retFuente){
        double sNeto;
        sNeto = sBruto-retFuente;
        return sNeto;
    }
}

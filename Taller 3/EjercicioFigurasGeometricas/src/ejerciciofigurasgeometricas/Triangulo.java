package ejerciciofigurasgeometricas;

public class Triangulo {
    public static double calcularArea(double base, double altura) {
        return (base*altura)/2;
    }
    public static double calcularPerímetro(double base, double altura) {
        return base+altura+calcularHipotenusa(base,altura);
    }
    public static double calcularHipotenusa(double base, double altura) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public static String calcularTipo(double base, double altura) {
        String tipo;
        double hipotenusa = calcularHipotenusa(base,altura);
        if(base == altura && base== hipotenusa)
            tipo = "Equilatero";
        else if (base == altura | base== hipotenusa | altura== hipotenusa){
            tipo = "Isoceles";
        }
        else{
            tipo = "Escaleno";
        }
        return tipo;
    }
}

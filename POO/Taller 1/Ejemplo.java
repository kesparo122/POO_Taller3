class Edades {
    public static void main(String[] args) {
        double juan=15, alberto, ana, mama;
        alberto=(2*juan)/3;
        ana=(4*juan)/3;
        mama=juan+alberto+ana;
        System.out.println("Sus edades son: ");
        System.out.println("Juan: "+juan);
        System.out.println("Alberto: "+alberto);
        System.out.println("Ana: "+ana);
        System.out.println("Mama: "+mama);
    }
}

class salarioBruto {
    public static void main(String[] args) {
        double h=48, r=5000, salarioBruto,salarioNeto;
        salarioBruto=48*r;
        salarioNeto=salarioBruto-(salarioBruto*0.125);
        System.out.println("Salario bruto: "+salarioBruto+" semanales.");
        System.out.println("Salario neto: "+salarioNeto+" semanales.");
    }
}
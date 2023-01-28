public class OperadoresLogicos2 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;

        System.out.println("Conjunção");
        System.out.println("b1 && b2 " + ( b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        
        System.out.println("Disjunção");
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("Disjunção exclusiva");
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1" + (b4 ^ b1));
        
        System.out.println("Negação");
        System.out.println("!b1" + (!b1));
        System.out.println("!b1" + (!b1));

        System.out.println("Realizando expressões com os operadores lógicos");
        System.out.println("(i1 > i2 ) || (f2 < f1) -> " + ((i1 > i2 ) || (f2 < f1)));
        System.out.println("((i1 + i2) < (f2 - f1)) && true -> " + (((i1 + i2) < (f2 - f1)) && true));

        double salarioMensal = 1320.5d;
        double mediaSalario = 1500.1d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxílio -> " + recebeAuxilio);

    }
}

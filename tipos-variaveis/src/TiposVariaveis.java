public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //isso de converter a força não é uma boa prática

        System.out.print(salarioMinimo);
        System.out.println(numeroCurto2);
    }
}

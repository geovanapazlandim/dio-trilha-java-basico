public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("NumeroUm é igual a NumeroDois? "+ " " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a NumeroDois? "+ " " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior a NumeroDois? "+ " " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("NumeroUm é maior ou igual a NumeroDois? "+ " " + simNao);

        simNao = numero1 < numero2;

        System.out.println("NumeroUm é menor a NumeroDois? "+ " " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("NumeroUm é menor ou igual a NumeroDois? "+ " " + simNao);
    }
}

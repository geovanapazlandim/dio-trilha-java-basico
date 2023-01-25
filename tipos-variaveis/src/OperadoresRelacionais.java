public class OperadoresRelacionais {
    public static void main(String[] args) {
        //comparando o que está escrito
        String nomeUm = "GEOVANA";
        String nomeDois = "GEOVANA";

        System.out.println(nomeUm == nomeDois);

        //comparando diferentes objetos sem uso do equals

        String nomeUmm = "GEOVANA";
        String nomeDoiss = new String("GEOVANA");

        System.out.println(nomeUmm == nomeDoiss);

        //comparando objetos diferentes usando o o equals

        String nomeUmmm = "GEOVANA";
        String nomeDoisss = new String("GEOVANA");

        System.out.println(nomeUmmm.equals(nomeDoisss));


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

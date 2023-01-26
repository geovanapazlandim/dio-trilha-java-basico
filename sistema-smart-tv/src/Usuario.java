public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual-> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status atual-> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Status atual-> Volume atual: " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Status atual-> Volume atual: " + smartTv.volume);

        System.out.println("Canal original: " + smartTv.canal);
        smartTv.mudarCanal(85);
        System.out.println("o canal informado: " + smartTv.canal);
    }
}

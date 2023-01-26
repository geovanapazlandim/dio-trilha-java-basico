public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: ");
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: ");
    }

    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public void mudarCanal(int numeroCanal) {
        canal = numeroCanal;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 20;

// ligar/desligar tv
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

//mudar canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

//volume    
    public void aumentarVolume(int incremento){
        volume += incremento;
    }
    public void diminuirVolume(int decremento){
        volume -= decremento;
    }

}
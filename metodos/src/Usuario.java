public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        //primeiro status
        System.out.println("TV ligada?:"+smartTv.ligada);
        System.out.println("Canal:" +smartTv.canal);
        System.out.println("Volume:"+smartTv.volume);

        //modificações
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada?: "+smartTv.ligada);

        smartTv.mudarCanal(15);
        System.out.println("Mudança de canal: "+smartTv.canal);

        smartTv.aumentarVolume(6);
        System.out.println("Volume: "+smartTv.volume);
        
        smartTv.diminuirVolume(7);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada?: "+smartTv.ligada);

    }
}

package Methods;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.diminurVolume();
        smartTV.diminurVolume();

        smartTV.mudarCanal(13);

        System.out.println("Tv Ligada ? " + smartTV.ligada);
        System.out.println("Tv Canal ? " + smartTV.canal);
        System.out.println("Tv Volume ? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("*Novo Comando*" + "Tv Ligada ? " + smartTV.ligada);
    }

}

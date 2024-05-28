public class While {
    public static void main(String[] args) {
        String[] carneirinhos = {"Dolly", "Molly", "Polly", "Bolly", "Jolly", "Folly", "Golly", "Holly", "Lolly", "Zolly"};
        int i = 0;
        while(i < carneirinhos.length) {
            System.out.println("Carneirinho " + carneirinhos[i] + " pulou a cerca");
            i++;
        }
    }
}

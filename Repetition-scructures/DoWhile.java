public class DoWhile {
    public static void main(String[] args) {
        String[] carneirinhos = {"Dolly", "Molly", "Polly", "Bolly", "Jolly", "Folly", "Golly", "Holly", "Lolly", "Zolly"};
        int i = 0;
        do {
            System.out.println("Carneirinho " + carneirinhos[i] + " pulou a cerca");
            i++;
        } while(i < carneirinhos.length);
    }
}

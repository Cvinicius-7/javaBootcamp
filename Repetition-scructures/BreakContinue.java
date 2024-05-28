public class BreakContinue {
    public static void main(String[] args) {
        String[] carneirinhos = {"Dolly", "Molly", "Polly", "Bolly", "Jolly", "Folly", "Golly", "Holly", "Lolly", "Zolly"};
        for(int i = 0; i < carneirinhos.length; i++) {
            if(carneirinhos[i].equals("Jolly")) {
                break;
            }
            System.out.println("Carneirinho " + carneirinhos[i] + " pulou a cerca");
        }
    }
}

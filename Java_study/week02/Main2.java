package week02;

public class Main2 {
    public static void main(String[] args) {
        FindApproximateValue find = new FindApproximateValue();
        System.out.println("[근사값 찿기 게임]");

        while (true) {
            find.loseWinOut(find.gameAct());
            if (find.outGame()) {
                break;
            }
        }
    }
}
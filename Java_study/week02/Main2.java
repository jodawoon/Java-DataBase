package week02;

public class Main2 {
    public static void main(String[] args) {
        FindApproximateValue find = new FindApproximateValue();
        System.out.println("[�ٻ簪 �O�� ����]");

        while (true) {
            find.loseWinOut(find.gameAct());
            if (find.outGame()) {
                break;
            }
        }
    }
}
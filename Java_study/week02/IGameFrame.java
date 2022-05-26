package week02;

import java.util.Scanner;

public interface IGameFrame {

    public <T> T computerSelect();
    public <T> T userSelect();

    public boolean gameAct();
    
    default void loseWinOut(boolean loseWin){
        if (loseWin)
            System.out.println("\n[���� �¸�]\n");
        else
            System.out.println("\n[��ǻ�� �¸�]\n");
    }

    default boolean outGame() {
        Scanner scanner = new Scanner(System.in);
        boolean regame = false;

        while (true) {
            System.out.println("[������ ���� �Ͻðڽ��ϱ�? Y/N]\n");
            String select = scanner.next();

            if(select.equals("Y") || select.equals("y")){
                System.out.println("\n[���� ����]\n");
                regame = true;
                break;
            }
            else if (select.equals("N") || select.equals("n")) {
                break;
            }
            else {
                System.out.println("\n[�� �� ���� ��ɾ��Դϴ�]\n");
            }
        }
        return regame;
    }
}
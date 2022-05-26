package week02;

import java.util.Scanner;

public interface IGameFrame {

    public <T> T computerSelect();
    public <T> T userSelect();

    public boolean gameAct();
    
    default void loseWinOut(boolean loseWin){
        if (loseWin)
            System.out.println("\n[유저 승리]\n");
        else
            System.out.println("\n[컴퓨터 승리]\n");
    }

    default boolean outGame() {
        Scanner scanner = new Scanner(System.in);
        boolean regame = false;

        while (true) {
            System.out.println("[게임을 종료 하시겠습니까? Y/N]\n");
            String select = scanner.next();

            if(select.equals("Y") || select.equals("y")){
                System.out.println("\n[게임 종료]\n");
                regame = true;
                break;
            }
            else if (select.equals("N") || select.equals("n")) {
                break;
            }
            else {
                System.out.println("\n[알 수 없는 명령어입니다]\n");
            }
        }
        return regame;
    }
}
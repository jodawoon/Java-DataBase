package week02;

import java.util.Scanner;

public class Main {
    public static void whatGame(RockPaperScissors rsp) {
        if (rsp instanceof MuckJjiPa) {
        	
            System.out.println("\n[����� ����]");
        } else if (rsp instanceof HaNaBbaGi) {
            System.out.println("\n[�ϳ����� ����]");
        } else {
            System.out.println("\n[���������� ����]");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissors actGame;

        while (true) {
            System.out.println("[�� ������ ���� �ϼ���]\n\n[1. ���� ���� ��] [2. �����] [3. �ϳ�����] [���� : q]");
            String select = scanner.next();

            if (select.equals("q")) {
                System.out.println("\n[����]");
                break;
            } else if (select.equals("1")) {
                actGame = new RockPaperScissors();
            } else if (select.equals("2")) {
                actGame = new MuckJjiPa();
            } else if (select.equals("3")){
                actGame = new HaNaBbaGi();
            } else {
                System.out.println("\n[�� �� ���� ��ɾ� �Դϴ�.]\n");
                continue;
            }

            whatGame(actGame);

            while (true) {
                actGame.loseWinOut(actGame.gameAct());
                if (actGame.outGame())
                    break;
            }
        }
    }
}
package week02;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements IGameFrame {

    @Override
    public <T> T  computerSelect() {
        Random random = new Random();
        int selectNum = random.nextInt(2);
        T select = (T) "";
        
        switch (selectNum) {
            case 0:
                select = (T) "����";
                break;
            case 1:
                select = (T) "����";
                break;
            case 2:
                select = (T) "��";
                break;
        }

        return select;
    }

    @Override
    public <T> T  userSelect() {
        Scanner scanner = new Scanner(System.in);
        String select = "";

        while (true) {
            System.out.println("\n[����] [����] [��]\n");
            select = scanner.next();

            if (!(select.equals("����") || select.equals("����") || select.equals("��"))) {
                System.out.println("\n[���� ���� �� �� �ϳ��� �Է��� �ּ���.]");
                continue;
            }
            else {
                break;
            }
        }

        return (T) select;
    }

    @Override
    public boolean gameAct() {
        boolean losewin = true;

        while (true) {
            String user = userSelect();
            String computer = computerSelect();

            System.out.println("\n���� : " + user);
            System.out.println("��ǻ�� : " + computer);

            if (user.equals(computer)) {
                System.out.println("\n[�����ϴ�]\n");
                continue;
            }
            else {
                switch (user) {
                    case "����":
                        if (computer.equals("����"))
                            losewin = false;
                        break;
                    case "����":
                        if (computer.equals("��"))
                            losewin = false;
                        break;
                    case "��":
                        if (computer.equals("����"))
                            losewin = false;
                        break;
                }
                break;
            }
        }

        return losewin;
    }
}
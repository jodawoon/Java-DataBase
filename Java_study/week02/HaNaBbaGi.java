package week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HaNaBbaGi extends RockPaperScissors{
    
    @Override
    public boolean gameAct() {
        boolean losewin = true;
        while (true) {
            String[] userStrings = new String[2];
            String[] computerStrings = new String[2];

            System.out.println("\n[ù��° ����]");
            userStrings[0] = userSelect();
            System.out.println("\n[�ι�° ����]");
            userStrings[1] = userSelect();

            computerStrings[0] = computerSelect();
            computerStrings[1] = computerSelect();

            System.out.println("\n���� : " + userStrings[0] + ", " + userStrings[1]);
            System.out.println("��ǻ�� : " + computerStrings[0] + ", " + computerStrings[1]);

            String[] selectStrings = selectString(userStrings, computerStrings);

            System.out.println("\n���� ���� : " + selectStrings[0] + "\n��ǻ�� ���� : " + selectStrings[1]);

            if (selectStrings[0].equals(selectStrings[1])) {
                System.out.println("\n[�����ϴ�]\n");
                continue;
            }
            else {
                switch (selectStrings[0]) {
                    case "����":
                        if (selectStrings[1].equals("����"))
                            losewin = false;
                        break;
                    case "����":
                        if (selectStrings[1].equals("��"))
                            losewin = false;
                        break;
                    case "��":
                        if (selectStrings[1].equals("����"))
                            losewin = false;
                        break;
                }
                break;
            }
        }

        return losewin;
    }

    public String[] selectString(String[] userStrings, String[] computerStrings) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] selectArray = new String[2];

        while (true) {
            System.out.println("\n[����(1 or 2)]");

            try {
                int userSelect = scanner.nextInt();
                selectArray[0] = userStrings[userSelect-1];
            } catch (InputMismatchException e) {
                System.out.println("\n[���ڸ� �Է��ϼ���]");
                continue;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n[1 Ȥ�� 2�� �������ּ���]");
                continue;
            }
            
            break;
        }

        selectArray[1] = computerStrings[random.nextInt(1)];

        return selectArray;
    }
}
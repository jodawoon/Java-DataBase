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

            System.out.println("\n[첫번째 선택]");
            userStrings[0] = userSelect();
            System.out.println("\n[두번째 선택]");
            userStrings[1] = userSelect();

            computerStrings[0] = computerSelect();
            computerStrings[1] = computerSelect();

            System.out.println("\n유저 : " + userStrings[0] + ", " + userStrings[1]);
            System.out.println("컴퓨터 : " + computerStrings[0] + ", " + computerStrings[1]);

            String[] selectStrings = selectString(userStrings, computerStrings);

            System.out.println("\n유저 선택 : " + selectStrings[0] + "\n컴퓨터 선택 : " + selectStrings[1]);

            if (selectStrings[0].equals(selectStrings[1])) {
                System.out.println("\n[비겼습니다]\n");
                continue;
            }
            else {
                switch (selectStrings[0]) {
                    case "가위":
                        if (selectStrings[1].equals("바위"))
                            losewin = false;
                        break;
                    case "바위":
                        if (selectStrings[1].equals("보"))
                            losewin = false;
                        break;
                    case "보":
                        if (selectStrings[1].equals("가위"))
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
            System.out.println("\n[선택(1 or 2)]");

            try {
                int userSelect = scanner.nextInt();
                selectArray[0] = userStrings[userSelect-1];
            } catch (InputMismatchException e) {
                System.out.println("\n[숫자를 입력하세요]");
                continue;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n[1 혹은 2를 선택해주세요]");
                continue;
            }
            
            break;
        }

        selectArray[1] = computerStrings[random.nextInt(1)];

        return selectArray;
    }
}
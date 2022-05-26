package week02;

import java.util.Random;
import java.util.Scanner;

public class FindApproximateValue implements IGameFrame{

    @Override
    public <T> T  computerSelect() {
        Random random = new Random();

        return (T) (Integer.valueOf(random.nextInt(99)+1));
    }

    @Override
    public <T> T  userSelect() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("\n[숫자를 입력하세요 (1 ~ 100)]\n");
            num = scanner.nextInt();

            if (num >= 1 && num <= 100) {
                break;
            }
            else {
                System.out.println("[1부터 100까지의 숫자를 선택해 주세요]");
            }
        }

        return (T) Integer.valueOf(num);
    }

    @Override
    public boolean gameAct() {
        boolean losewin = true;
        Random random = new Random();

        while (true) {
            int user = Integer.parseInt(userSelect());
            int computer = Integer.parseInt(computerSelect());

            int value = random.nextInt(99) + 1;

            System.out.println("\n제시된수 : " + value + "\n유저가 제시한수 : " + user + "\n컴퓨터가 제시한수 : " + computer);
            System.out.println("\n유저의 차이 : " + Math.abs(value - user) + "\n컴퓨터의 차이 : " + Math.abs(value - computer));

            if(Math.abs(value - user) == Math.abs(value - computer)){
                System.out.println("\n[비겼습니다]\n");
                continue;
            } else if (Math.abs(value - user) > Math.abs(value - computer)) {
                losewin = false;
            }

            break;
        }

        return losewin;
    }
    
}